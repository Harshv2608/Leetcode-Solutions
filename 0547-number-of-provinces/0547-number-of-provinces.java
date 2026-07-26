class Solution {
    public void dfs(int node,List<List<Integer>> adj,boolean[] vis){
        vis[node]=true;
        for(int it: adj.get(node)){
            if(!vis[it]){
                dfs(it,adj,vis);
            }
        }
    }
    public int findCircleNum(int[][] isConnected) {
        List<List<Integer>> adj=new ArrayList<>();
        int V =isConnected.length;
        boolean[] vis=new boolean[V];
        for(int i=0;i<V;i++){
            adj.add(new ArrayList<>());
        }
        for(int i=0;i<V;i++){
            for(int j=0;j<V;j++){
                if(isConnected[i][j]==1 && i!=j){
                    adj.get(i).add(j);
                    adj.get(j).add(i);
                }
            }
        }
        int cnt=0;
        for(int i=0;i<V;i++){
            if(!vis[i]){
                cnt++;
                dfs(i,adj,vis);
            }
        }
        return cnt;
    }
}