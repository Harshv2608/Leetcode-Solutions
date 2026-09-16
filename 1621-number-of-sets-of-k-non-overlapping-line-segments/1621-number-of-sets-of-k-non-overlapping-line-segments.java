class Solution {
    static final int MOD=1_000_000_007;
    public int numberOfSets(int n,int k) {
        long[][] dp=new long[n+1][k+1];
        for(int i=0;i<=n;i++) {
            dp[i][0]=1;
        }
        for(int j=1;j<=k;j++){
            long sum=0;
            for(int i=1;i<=n;i++){
                dp[i][j]=dp[i-1][j];
                dp[i][j]+=sum;
                dp[i][j]%=MOD;
                sum+=dp[i][j-1];
                sum%=MOD;
            }
        }
        return (int)dp[n][k];
    }
}