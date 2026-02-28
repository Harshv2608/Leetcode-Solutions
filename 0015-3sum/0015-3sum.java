class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> res=new ArrayList<>();
        int n=nums.length;
        for(int i=0;i<n-2;i++){
            if(i>0 && nums[i-1]==nums[i])continue;
            int left=i+1;
            int right=n-1;
            while(left<right){
                int sum=nums[i]+nums[left]+nums[right];
                if(sum==0){
                    res.add(Arrays.asList(nums[i],nums[left],nums[right]));
                    left++;
                    right--;
                    while(left<right && nums[left-1]==nums[left])left++;
                    while(left<right && nums[right+1]==nums[right])right--;
                }
                else if(sum>0){
                    right--;
                }else{
                    left++;
                }
            }
        }return res;
    }
}