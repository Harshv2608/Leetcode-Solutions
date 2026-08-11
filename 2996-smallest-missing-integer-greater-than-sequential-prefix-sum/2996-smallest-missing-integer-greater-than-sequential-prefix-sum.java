class Solution {
    public int missingInteger(int[] nums) {
        int n=nums.length;
        Set<Integer> set=new HashSet<>();
        for(int x:nums){
            set.add(x);
        }
        int maxsum=nums[0];
        for(int i=1;i<nums.length;i++){
            if(nums[i-1]+1==nums[i]){
                maxsum+=nums[i];
            }else{
                break;
            }
        }
        while(set.contains(maxsum)){
            maxsum++;
        }
        return maxsum;
    }
}