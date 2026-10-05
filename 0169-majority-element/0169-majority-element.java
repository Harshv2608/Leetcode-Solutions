class Solution {
    public int majorityElement(int[] nums) {
        int el=nums[0];
        int cnt=1;
        for(int i=1;i<nums.length;i++){
            if(cnt==0){
                el=nums[i];
            }
            if(nums[i]==el)cnt++;
            else cnt--;
        }
        return el;
    }
}