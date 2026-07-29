class Solution {
    public int uniquePaths(int m, int n) {
        if(m==0 && n==0) return 1;
        int[][] dp=new int[m][n];
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                int top=0;
                int left=0;
                if(i>0){
                    top=dp[i-1][j];
                }
                if(j>0){
                    left=dp[i][j-1];
                }
                dp[i][j]=top+left;
                if(i==0 && j==0)dp[i][j]=1;
            }
        }
        return dp[m-1][n-1];
    }
}