class Solution {
    public int[] transformArray(int[] nums) {
        int min=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]%2==0){
                min++;
            }
        }
        for(int i=0;i<min;i++){
            nums[i]=0;
        }
        for(int i=min;i<nums.length;i++){
            nums[i]=1;
        }return nums;
    }
}