class Solution {
    public int rob(int[] nums) {
        int n=nums.length;
        int prev2=0;
        int prev=nums[0];
        for(int i=1;i<n;i++){
            int fs=nums[i];
            if(i>1)fs+=prev2;
            int ls=prev;
            int curr=(Math.max(fs,ls));
            prev2=prev;
            prev=curr;
        }
        return prev;
    }
}