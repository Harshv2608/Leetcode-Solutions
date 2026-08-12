class Solution {
    public int maxSubarrayLength(int[] nums, int k) {
        int n=nums.length;
        int sol=0;
        int left=-1;
        Map<Integer,Integer> map=new HashMap<>();
        for(int right=0;right<n;right++){
            map.put(nums[right],map.getOrDefault(nums[right],0)+1);
            while(map.get(nums[right])>k){
                left++;
                map.put(nums[left],map.get(nums[left])-1);
            }
            sol=Math.max(sol,right-left);
        }
        return sol;
    }
}