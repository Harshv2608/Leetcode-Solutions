class Solution {
    
    public int rob(int[] nums) {
        if(nums==null || nums.length==0)return 0;
        int n=nums.length;
        if(n==1)return nums[0];
        int prev1=0;
        int prev2=0;
        for(int i=0;i<n;i++){
            int current=Math.max(prev1,prev2+nums[i]);
            prev2=prev1;
            prev1=current;
        }return prev1;

    }
}