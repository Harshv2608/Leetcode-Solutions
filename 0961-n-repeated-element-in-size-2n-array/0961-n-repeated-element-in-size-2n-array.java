class Solution {
    public int repeatedNTimes(int[] nums) {
        int n=nums.length;
        int soln=0;
        HashSet<Integer> map=new HashSet<>();
        for(int i=0;i<n;i++){
            if(map.contains(nums[i])){
                soln=nums[i];
                break;
            }else{
                map.add(nums[i]);
            }
        }return soln;
    }
}