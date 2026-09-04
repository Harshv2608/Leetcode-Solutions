class Solution {
    public int firstStableIndex(int[] nums, int k) {
        int n=nums.length;
        int[] pre=new int[n];
        int[] suff=new int[n];
        int max=nums[0];
        int min=nums[n-1];
        for(int i=0;i<n;i++){
            max=Math.max(max,nums[i]);
            min=Math.min(min,nums[n-1-i]);
            pre[i]=max;
            suff[n-1-i]=min;
        }
        for(int i=0;i<n;i++){
            int score=pre[i]-suff[i];
            if(score<=k){
                return i;
            }
        }
        return -1;
    }
}