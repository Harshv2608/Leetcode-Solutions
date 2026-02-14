class Solution {
    public int[] smallerNumbersThanCurrent(int[] nums) {
        int soln[]=new int[nums.length];
        int n=nums.length;
        for(int i=0;i<n;i++){
            int count=0;
            for(int j=0;j<n;j++){
                if(nums[j]<nums[i]){
                    count++;
                }
            }
            soln[i]=count;
        }
        return soln;
    }
}