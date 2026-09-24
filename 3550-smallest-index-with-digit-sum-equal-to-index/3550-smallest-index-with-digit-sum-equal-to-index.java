class Solution {
    public int smallestIndex(int[] nums) {
        int n=nums.length;
        int ans=-1;
        for(int i=0;i<Math.min(37,n);i++){
            int sum=0;
            int x=nums[i];
            while(x>0){
                sum+=x%10;
                x/=10;
            }
            if(sum==i)return i;
        }
        return -1;
    }
}