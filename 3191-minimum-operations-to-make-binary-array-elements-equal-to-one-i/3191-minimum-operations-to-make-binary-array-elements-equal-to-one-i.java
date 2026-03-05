class Solution {
    public int minOperations(int[] nums) {
        int n=nums.length;
        int left=0;
        int right=2;
        int count=0;
        while(right<n){
            if(nums[left]==0){
                nums[left]=1;
                nums[left+1]=1-nums[left+1];
                nums[right]=1-nums[right];
                count++;
                left++;
                right++;
            }else{
                left++;
                right++;
            }
        }
        if(nums[n-1]==0 || nums[n-2]==0)return -1;
        return count;
    }
}