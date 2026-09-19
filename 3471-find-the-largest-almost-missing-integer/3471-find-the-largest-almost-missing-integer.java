class Solution {
    public int largestInteger(int[] nums, int k) {
        int n=nums.length;
        Map<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<n-k+1;i++){
            Set<Integer> set=new HashSet<>();
            for(int j=i;j<i+k;j++){
                if(set.add(nums[j])){
                map.put(nums[j],map.getOrDefault(nums[j],0)+1);
                }
            }
        }
        int max=-1;
        for(int num:nums){
            if(map.get(num)==1){
                max=Math.max(max,num);
            }
        }
        return max;
    }
}