class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        int n=nums.length;
        int[] lmax=new int[n];
        int[] rmax=new int[n];
        lmax[0]=nums[0];
        rmax[n-1]=nums[n-1];
        for(int i=1;i<n;i++){
            if(i%k==0){
                lmax[i]=nums[i];
            }else{
                lmax[i]=Math.max(lmax[i-1],nums[i]);
            }
            if((n-1-i)%k==0){
                rmax[n-1-i]=nums[n-1-i];
            }else{
                rmax[n-1-i]=Math.max(rmax[n-i],nums[n-1-i]);
            }
        }
        int[] output=new int[n-k+1];
        for(int i=0;i<n-k+1;i++){
            output[i]=Math.max(rmax[i],lmax[i+k-1]);
        }
        return output;
    }
}