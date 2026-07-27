class Solution {
    public boolean dfs(int node,ArrayList<ArrayList<Integer>> adj,int[] vis){
        vis[node]=1;
        for(int it: adj.get(node)){
            if(vis[it]==0){
                if(dfs(it,adj,vis))return true;
            }else if(vis[it]==1)return true;
        }
        vis[node]=2;
        return false;
    }
    public boolean canFinish(int numCourses, int[][] prerequisites) {
        int V=numCourses;
        ArrayList<ArrayList<Integer>> adj=new ArrayList<>();
        for(int i=0;i<V;i++){
            adj.add(new ArrayList<>());
        }
        for(int i=0;i<prerequisites.length;i++){
            adj.get(prerequisites[i][1]).add(prerequisites[i][0]);
        }
        int[] vis=new int[V];
        for(int i=0;i<V;i++){
            if(vis[i]==0){
                if(dfs(i,adj,vis)){
                    return false;
                }
            }
        }return true;
    }
}