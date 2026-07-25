class Solution {
    public int sumbyd(int[] arr,int n,int div){
        int sum=0;
        for(int x:arr){
            sum+=Math.ceil((double)(x)/(double)(div));
        }return sum;
    }
    public int smallestDivisor(int[] nums, int threshold) {
        int n=nums.length;
        int max=0;
        for(int x:nums){
            max=Math.max(max,x);
        }
        int low=0;
        int high=max;
        while(low<=high){
            int mid=low+(high-low)/2;
            if(sumbyd(nums,n,mid)<=threshold){
                high=mid-1;
            }else{
                low=mid+1;
            }
        }return low;
        
    }
}