class Solution {
    public long maxTotalValue(int[] nums, int k) {
        int max=-1;
        int min=Integer.MAX_VALUE;
        for(int i=0;i<nums.length;i++){
            max=Math.max(max,nums[i]);
            min=Math.min(min,nums[i]);
        }
        return (long)k*(long)(max-min);
    }
}