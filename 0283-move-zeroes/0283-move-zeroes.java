class Solution {
    public void moveZeroes(int[] nums) {
        int[] ans=new int[nums.length];
        int k=0;
        int count=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]!=0){
                count++;
            }
        }
        for(int j=0;j<nums.length;j++){
            if(nums[j]!=0){
                ans[k]=nums[j];
                k++;
            }
        }
        for(int i=count;i<nums.length;i++){
            ans[i]=0;
        }
        for(int i=0;i<nums.length;i++){
            nums[i]=ans[i];
        }
    }
}