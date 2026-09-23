class Solution {
    public int minOperations(int[] nums, int x) {
        int n=nums.length;
        long sum=0;
        for(int a:nums){
            sum+=a;
        }
        long target=sum-x;
        if(target<0)return -1;
        if(x==0)return n;
        int left=0;
        long wsum=0;
        int max=-1;
        for(int right=0;right<n;right++){
            wsum+=nums[right];
            while(left<=right && wsum>target){
                wsum-=nums[left++];
            }
            if(target==wsum){
                max=Math.max(max,right-left+1);
            }
        }
        if(max==-1)return -1;
        return n-max;
    }
}