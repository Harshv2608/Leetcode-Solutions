class Solution {
    public int lastoccur(int[] arr, int k){
        int low=0;
        int high=arr.length-1;
        int ans=-1;
        while(low<=high){
            int mid=low+(high-low)/2;
            if(arr[mid]==k){
                ans=mid;
                low=mid+1;
            }else if(arr[mid]>k){
                high=mid-1;
            }else{
                low=mid+1;
            }
        }
        return ans;
    }
    public int firstoccur(int[] arr, int k){
        int low=0;
        int high=arr.length-1;
        int ans=-1;
        while(low<=high){
            int mid=low+(high-low)/2;
            if(arr[mid]==k){
                ans=mid;
                high=mid-1;
            }else if(arr[mid]>k){
                high=mid-1;
            }else{
                low=mid+1;
            }
        }
        return ans;
    }
    public int[] searchRange(int[] nums, int target) {
        int first=firstoccur(nums,target);
        if(first==-1)return new int[] {-1,-1};
        int last=lastoccur(nums,target);
        return new int[] {first,last};
    }
}