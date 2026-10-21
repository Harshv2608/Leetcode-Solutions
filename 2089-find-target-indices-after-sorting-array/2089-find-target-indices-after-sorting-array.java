class Solution {
    public List<Integer> targetIndices(int[] nums, int target) {
        List<Integer> ans=new ArrayList<>();
        int cnt=0;
        int less=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]<target)less++;
            else if(nums[i]==target)cnt++;
        }
        for(int i=less;i<less+cnt;i++){
            ans.add(i);
        }
        return ans;
    }
}