class Solution {
    public boolean canPartition(int[] nums) {
        int sum=0;
        for(int x:nums){
            sum+=x;
        }
        if(sum%2==1)return false;
        sum/=2;
        int n=nums.length;
        boolean[][] dp=new boolean [n+1][sum+1];
        dp[n][0]=true;
        for(int index=n-1;index>=0;index--){
            for(int t=0;t<=sum;t++){
                boolean nottake=dp[index+1][t];
                boolean take=false;
                if(nums[index]<=t){
                    take=dp[index+1][t-nums[index]];
                }
                dp[index][t]=take || nottake;
            }
        }
        return dp[0][sum];
    }
}