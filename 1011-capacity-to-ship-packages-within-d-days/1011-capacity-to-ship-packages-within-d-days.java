class Solution {
    public int finddays(int[] arr,int n,int capacity){
        int load=0;
        int day=1;
        for(int i=0;i<n;i++){
            if((load+arr[i])>capacity){
                day++;
                load=arr[i];
            }else{
                load+=arr[i];
            }
        }
        return day;
    }
    public int shipWithinDays(int[] weights, int days) {
        int n=weights.length;
        int max=0;
        int sum=0;
        for(int x:weights){
            sum+=x;
            max=Math.max(max,x);
        }
        int low=max;
        int high=sum;
        while(low<=high){
            int mid=low+(high-low)/2;
            if(finddays(weights,n,mid)<=days){
                high=mid-1;
            }else{
                low=mid+1;
            }
        }return low;
    }
}