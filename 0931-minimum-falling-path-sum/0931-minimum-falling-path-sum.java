class Solution {
    public int minFallingPathSum(int[][] matrix) {
        int n=matrix.length;
        int ans=Integer.MAX_VALUE;
        int[] prev=new int[n];
        for(int j=0;j<n;j++){
            prev[j]=matrix[0][j];
        }
        for(int i=1;i<n;i++){
            int[] curr=new int[n];
            for(int j=0;j<n;j++){
                int up=prev[j];
                int leftdiag=Integer.MAX_VALUE;
                int rightdiag=Integer.MAX_VALUE;
                if(j>0)leftdiag=prev[j-1];
                if(j<n-1)rightdiag=prev[j+1];
                curr[j]=matrix[i][j]+Math.min(up,Math.min(leftdiag,rightdiag));
            }
            prev=curr;
        }
        for(int j=0;j<n;j++){
            ans=Math.min(ans,prev[j]);
        }
        return ans;
    }
}