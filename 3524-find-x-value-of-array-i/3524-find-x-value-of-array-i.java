class Solution {
    public long[] resultArray(int[] nums, int k) {
        long[] res=new long[k];
        int n=nums.length;
        int[][] dp=new int[n][k];
        for(int i=0;i<n;i++){
            int rem=nums[i]%k;
            dp[i][rem]+=1;
            if(i==0)continue;
            for(int j=0;j<k;j++){
                int next=(int)(((long)rem*j)%k);
                dp[i][next]+=dp[i-1][j];
            }
        }
        for(int i=0;i<n;i++){
            for(int j=0;j<k;j++){
                res[j]+=dp[i][j];
            }
        }
        return res;
    }
}