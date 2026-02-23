class Solution {
    public int longestNiceSubarray(int[] nums) {
        int n=nums.length;
        int max=0;
        int left=0;
        int mask=0;
        for(int right=0;right<n;right++){
            while((mask & nums[right])!=0){
                mask = mask^nums[left];
                left++;
            }
            mask = mask| nums[right];
            max=Math.max(max,right-left+1);
        }
        return max;
    }
}