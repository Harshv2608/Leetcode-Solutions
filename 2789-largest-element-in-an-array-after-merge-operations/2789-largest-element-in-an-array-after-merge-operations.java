class Solution {
    public long maxArrayValue(int[] nums) {
        int n=nums.length;
        long max=nums[n-1];
        for(int i=n-2;i>=0;i--){
            if(nums[i]<=max)max+=nums[i];
            else max=nums[i];
        }
        return max;
    }
}