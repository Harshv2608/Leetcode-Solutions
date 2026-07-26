class Solution {
    public void dfs(int row,int col,int[][] ans,int[][] image,int[] delrow,int[] delcol,int newclr,int oldclr){
        ans[row][col]=newclr;
        int n=ans.length;
        int m=ans[0].length;
        for(int i=0;i<4;i++){
            int nrow=row+delrow[i];
            int ncol=col+delcol[i];
            if(nrow>=0 && nrow<n && ncol>=0 && ncol<m && image[nrow][ncol]==oldclr && ans[nrow][ncol]!=newclr){
                dfs(nrow,ncol,ans,image,delrow,delcol,newclr,oldclr);
            }
        }

    }
    public int[][] floodFill(int[][] image, int sr, int sc, int color) {
        int initclr=image[sr][sc];
        int[][] ans=image;
        int deltarow[]={-1,+1,0,0};
        int deltacol[]={0,0,-1,+1};
        dfs(sr,sc,ans,image,deltarow,deltacol,color,initclr);
        return ans;
    }
}