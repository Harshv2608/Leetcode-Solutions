class Solution {
    public int solve(int[] nums){
        int n=nums.length;
        int prev2=0;
        int prev=nums[0];
        for(int i=1;i<n;i++){
            int fs=nums[i];
            if(i>1){
                fs+=prev2;
            }
            int ls=prev;
            int curr=Math.max(fs,ls);
            prev2=prev;
            prev=curr;
        }
        return prev;
    }
    public int rob(int[] nums) {
        int n=nums.length;
        if(n==1)return nums[0];
        int[] temp1=new int[n-1];
        int[] temp2=new int[n-1];
        int a=0;
        int b=0;
        for(int i=0;i<n;i++){
            if(i!=0){
                temp1[a++]=nums[i];
            }
            if(i!=n-1){
                temp2[b++]=nums[i];
            }
        }
        return Math.max(solve(temp1),solve(temp2));
    }
}