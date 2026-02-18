class Solution {
    public int[] getFinalState(int[] nums, int k, int multiplier) {
        int n=nums.length;
        while(k>0){
            int min=nums[0];
            int x=0;
            for(int i=0;i<n;i++){
                if(nums[i]<min){
                    min=nums[i];
                    x=i;
                }
            }nums[x]*=multiplier;
            k--;
        }
        return nums;
    }
}