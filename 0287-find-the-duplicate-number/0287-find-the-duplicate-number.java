class Solution {
    public int findDuplicate(int[] nums) {
        int n=nums.length;
        Arrays.sort(nums);
        int l=0;
        for(int r=1;r<n;r++){
            if(nums[l]!=nums[r]){
                l++;
            }else return nums[r];
        }return -1;
    }
}