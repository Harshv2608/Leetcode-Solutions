class Solution {
    public int[] twoSum(int[] nums, int target) {
        int n=nums.length;
        HashMap<Integer,Integer> map=new HashMap<>();

        for(int i=0;i<n;i++){
            map.put(nums[i],i);
        }
        for(int i=0;i<n;i++){
            int x=target-nums[i];
            if(map.containsKey(x)&&map.get(x)!=i){
                return new int[]{i,map.get(x)};
            }
        }return nums;
    }
}