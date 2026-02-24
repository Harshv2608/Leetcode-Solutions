class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int n=nums.length;
        int maxi=0;
        int cnt=0;
        for(int i=0;i<n;i++){
            if(nums[i]==1){
                cnt++;
            }else{
                cnt=0;
            }
            maxi=Math.max(cnt,maxi);
        }
        return maxi;
    }
}