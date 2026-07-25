class Solution {
    public int numofpartition(int[] nums,int maxsum,int n){
        int partition=1;
        long subsum=0;
        for(int x:nums){
            if((subsum+x) <= maxsum){
                subsum+=x;
            }else{
                partition++;
                subsum=x;
            }
        }
        return partition;
    }
    public int splitArray(int[] nums, int k) {
        int n=nums.length;
        int low=0;
        int high=0;
        for(int x:nums){
            high+=x;
            low=Math.max(low,x);
        }
        while(low<=high){
            int mid=low+(high-low)/2;
            if(numofpartition(nums,mid,n)<=k){
                high=mid-1;
            }else{
                low=mid+1;
            }
        }return low;
    }
}