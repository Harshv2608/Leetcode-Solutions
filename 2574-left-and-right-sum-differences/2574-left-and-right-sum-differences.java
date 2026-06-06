class Solution {
    public int[] leftRightDifference(int[] nums) {
        int n=nums.length;
        int sum=0;
        int[] ans=new int[n];
        int[] left=new int[n];
        int[] right=new int[n];
        left[0]=0;
        right[n-1]=0;
        for(int i=1;i<n;i++){
            left[i]=left[i-1]+nums[i-1];
        }
        for(int i=n-2;i>=0;i--){
            right[i]=right[i+1]+nums[i+1];
        }
        for(int i=0;i<n;i++){
            ans[i]=Math.abs(left[i]-right[i]);
        }
        return ans;
    }
}