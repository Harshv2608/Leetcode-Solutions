class Solution {
    public int[] rearrangeArray(int[] nums) {
        int n=nums.length;
        int pos=0;
        int neg=1;
        int[] ans=new int[n];
        for(int i=0;i<n;i++){
            if(nums[i]<0){
                ans[neg]=nums[i];
                neg+=2;
            }else{
                ans[pos]=nums[i];
                pos+=2;
            }
        }
        return ans;
    }
}