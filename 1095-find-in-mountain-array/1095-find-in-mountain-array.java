/**
 * // This is MountainArray's API interface.
 * // You should not implement it, or speculate about its implementation
 * interface MountainArray {
 *     public int get(int index) {}
 *     public int length() {}
 * }
 */
 
class Solution {
    private int findpeak(MountainArray arr,int n){
        int low=0;
        int high=n-1;
        while(low<high){
            int mid=low+(high-low)/2;
            if(arr.get(mid)<arr.get(mid+1))low=mid+1;
            else high=mid;
        }
        return low;
    }
    private int binary(MountainArray arr,int low,int high,int target,boolean isup){
        while(low<=high){
            int mid=low+(high-low)/2;
            int val=arr.get(mid);
            if(val==target)return mid;
            if(isup){
                if(val<target) low=mid+1;
                else high=mid-1;
            }else{
                if(val<target) high=mid-1;
                else low=mid+1;
            }
        }
        return -1;
    }
    public int findInMountainArray(int target, MountainArray mountainArr) {
        int n=mountainArr.length();
        int peak=findpeak(mountainArr,n);
        int res=binary(mountainArr,0,peak,target,true);
        if(res!=-1)return res;
        return binary(mountainArr,peak+1,n-1,target,false);
    }
}