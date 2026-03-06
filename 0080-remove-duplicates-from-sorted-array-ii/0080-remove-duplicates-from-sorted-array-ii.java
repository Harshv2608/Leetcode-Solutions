class Solution {
    public int removeDuplicates(int[] nums) {
        int n=nums.length;
        if(n<=2)return n;
        int left=2;
        for(int right=2;right<n;right++){
            if(nums[right]!=nums[left-2]){
                nums[left]=nums[right];
                left++;
            }
        }return left;
    }
}