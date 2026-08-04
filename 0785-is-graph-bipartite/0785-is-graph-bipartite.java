class Solution {
    public boolean dfs(int[][] graph,int[] color,int node,int col){
        color[node]=col;
        for(int x:graph[node]){
            if(color[x]==-1){
                if(!dfs(graph,color,x,1-col)) return false;
            }
            else if(color[x]==col) return false;
        }
        return true;
    }
    public boolean isBipartite(int[][] graph) {
        int n=graph.length;
        int[] color=new int[n];
        for(int i=0;i<n;i++){
            color[i]=-1;
        }
        for(int i=0;i<n;i++){
            if(color[i]==-1){
                if(!dfs(graph,color,i,0)){
                    return false;
                }
            }
        }
        return true;

    }
}