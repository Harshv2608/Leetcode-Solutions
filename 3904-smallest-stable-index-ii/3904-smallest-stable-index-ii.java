class Solution {
    public int firstStableIndex(int[] nums, int k) {
        int n=nums.length;
        int[] premax=new int[n];
        int[] sufmin=new int[n];
        premax[0]=nums[0];
        sufmin[n-1]=nums[n-1];
        for(int i=0;i<n;i++){
            if(i>0){
                premax[i]=Math.max(premax[i-1],nums[i]);
            }
            if(n-i-1<n-1){
                sufmin[n-i-1]=Math.min(sufmin[n-i],nums[n-i-1]);
            }
        }
        for(int i=0;i<n;i++){
            if(premax[i]-sufmin[i]<=k)return i;
        }
        return -1;
    }
}