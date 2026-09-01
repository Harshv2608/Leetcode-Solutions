class State{
    int row;
    int col;
    int energy;
    int mask;
    State(int row,int col,int energy,int mask){
        this.row=row;
        this.col=col;
        this.energy=energy;
        this.mask=mask;
    }
}
class Solution {
    public int minMoves(String[] classroom, int energy) {
        int m=classroom.length;
        int n=classroom[0].length();
        int sr=0;
        int sc=0;
        int totalL=0;
        int[][] litter=new int[m][n];
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                litter[i][j]=-1;
            }
        }
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                char cell=classroom[i].charAt(j);
                if(cell=='S'){
                    sr=i;
                    sc=j;
                }
                if(cell=='L'){
                    litter[i][j]=totalL;
                    totalL++;
                }
            }
        }
        int final_mask=(1<<totalL)-1;
        Queue<State> queue=new LinkedList<>();
        boolean[][][][] vis=new boolean[m][n][energy+1][1<<totalL];
        queue.add(new State(sr,sc,energy,0));
        vis[sr][sc][energy][0]=true;
        int[] delrow={-1,1,0,0};
        int[] delcol={0,0,-1,1};
        int moves=0;
        while(!queue.isEmpty()){
            int size=queue.size();
            while(size-->0){
            State curr=queue.poll();
            if(curr.mask==final_mask)return moves;
            if(curr.energy==0)continue;
            for(int i=0;i<4;i++){
                int nrow=curr.row+delrow[i];
                int ncol=curr.col+delcol[i];
                if(nrow>=0 && nrow<m && ncol>=0 && ncol<n && classroom[nrow].charAt(ncol)!='X' ){
                    int newEnergy=curr.energy-1;
                    int new_mask=curr.mask;
                    char c= classroom[nrow].charAt(ncol);
                    if(c=='L'){
                        new_mask=new_mask | (1<<litter[nrow][ncol]);
                    }
                    if(c=='R'){
                        newEnergy=energy;
                    }
                    if(vis[nrow][ncol][newEnergy][new_mask])continue;
                    vis[nrow][ncol][newEnergy][new_mask]=true;
                    queue.add(new State(nrow,ncol,newEnergy,new_mask));
                }
            }
            }
            moves++;
        }
        return -1;
    }
}