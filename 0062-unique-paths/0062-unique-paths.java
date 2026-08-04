class Solution {
    public int uniquePaths(int m, int n) {
        int[] prev=new int[n];
        for(int i=0;i<m;i++){
            int[] curr=new int[n];
            for(int j=0;j<n;j++){
                if(i==0 && j==0){
                    curr[j]=1;
                    continue;
                }    
                int fromtop=0;
                int fromright=0;
                if(i>0){
                    fromtop=prev[j];
                }
                if(j>0){
                    fromright=curr[j-1];
                }
                curr[j]=fromtop+fromright;
            }
            prev=curr;
        }
        return prev[n-1];
    }
}