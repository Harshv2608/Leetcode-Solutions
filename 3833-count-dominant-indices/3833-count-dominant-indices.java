class Solution {
    public int dominantIndices(int[] nums) {
        int count=0;
        int n=nums.length;
        long sum=nums[n-1];
        long avg=nums[n-1];
        for(int i=n-2;i>=0;i--){
            if(nums[i]>avg){
                count++;
            }
            sum+=nums[i];
            avg=sum/(n-i);
        }
        return count;
    }
}