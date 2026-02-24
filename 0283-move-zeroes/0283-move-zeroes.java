class Solution {
    public void moveZeroes(int[] nums) {
        int n=nums.length;
        int left=0;
        int right=0;
        for(int i=0;i<n;i++){
            if(nums[i]==0){
                left=i;
                right=i+1;
                break;
            }
        }
        while(right<n){
            if(nums[right]!=0){
                int temp=nums[right];
                nums[right]=nums[left];
                nums[left]=temp;
                left++;
                right++;
            }else{
                right++;
            }
        }
    }
}