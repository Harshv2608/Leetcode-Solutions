class Solution {
    public boolean dfscheck(List<List<Integer>> adj,int[] vis,int[] pathvis,int node){
        vis[node]=1;
        pathvis[node]=1;
        for(int x: adj.get(node)){
            if(vis[x]==0){
                if(dfscheck(adj,vis,pathvis,x))return true;
            }else if(pathvis[x]==1)return true;
        }
        pathvis[node]=0;
        return false;
    }
    public boolean canFinish(int numCourses, int[][] prerequisites) {
        int n=prerequisites.length;
        List<List<Integer>> adj=new ArrayList<>();
        for(int i=0;i<numCourses;i++){
            adj.add(new ArrayList<>());
        }
        for(int i=0;i<n;i++){
            adj.get(prerequisites[i][1]).add(prerequisites[i][0]);
        }
        int[] vis=new int[numCourses];
        int[] pathvis=new int[numCourses];
        for(int i=0;i<numCourses;i++){
            if(vis[i]==0){
                if(dfscheck(adj,vis,pathvis,i)) return false;
            }
        }
        return true;
    }
}