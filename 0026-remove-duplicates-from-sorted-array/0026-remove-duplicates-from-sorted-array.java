class Solution {
    public int removeDuplicates(int[] nums) {
        int n=nums.length;
        int left=0;
        for(int right=1;right<n;right++){
            if(nums[left]!=nums[right]){
                nums[left+1]=nums[right];
                left++;
            }
        }
        return left+1;
    }
}