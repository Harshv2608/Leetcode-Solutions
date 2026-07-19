class Solution {
    public int lower(int[] arr,int n,int k){
        int low=0;
        int high=n-1;
        int ans=n;
        while(low<=high){
            int mid=(low+high)/2;
            if(arr[mid]>=k){
                ans=mid;
                high=mid-1;
            }else{
                low=mid+1;
            }
        }
        return ans;
    }
    public int upper(int[] arr,int n,int k){
        int low=0;
        int high=n-1;
        int ans=n;
        while(low<=high){
            int mid=(low+high)/2;
            if(arr[mid]>k){
                ans=mid;
                high=mid-1;
            }else{
                low=mid+1;
            }
        }
        return ans;
    }
    public int[] searchRange(int[] nums, int target) {
        int n=nums.length;
        int lb=lower(nums,n,target);
        if(lb==n || nums[lb]!=target)return new int[]{-1,-1};
        return new int[]{lb,upper(nums,n,target)-1};
    }
}