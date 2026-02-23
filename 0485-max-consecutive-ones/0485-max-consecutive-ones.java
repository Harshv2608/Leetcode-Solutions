class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int n=nums.length;
        int count=0;
        int maxcount=0;
        for(int i=0;i<n;i++){
            if(nums[i]==1){
                count++;
                maxcount=Math.max(count,maxcount);
            }else{count=0;}
        }return maxcount;
    }
}