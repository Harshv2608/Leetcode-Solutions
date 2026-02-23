class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int n=nums.length;
        int left=0;
        int right=0;
        int count=0;
        while(right<n){
            if(nums[right]==0){
                left=right+1;
            }
            count=Math.max(count,right-left+1);
            right++;
        }
        return count;
    }
}