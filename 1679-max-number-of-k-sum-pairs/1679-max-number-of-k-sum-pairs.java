class Solution {
    public int maxOperations(int[] nums, int k) {
        Arrays.sort(nums);
        int n=nums.length;
        int left=0;
        int right=n-1;
        int count=0;
        while(left<right){
            if((nums[left]+nums[right] )== k){
                left++;
                right--;
                count++;
            }else if((nums[left] +nums[right] )>k){
                right--;
            }else{
                left++;
            }
        }return count;
    }
}