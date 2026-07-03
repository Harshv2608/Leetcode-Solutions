class Solution {
    public int findMaxK(int[] nums) {
        int max=-1;
        Set<Integer> set=new HashSet<>();
        for(int n:nums){
            if(set.contains(-1*n)){
                max=Math.max(max,Math.max(-1*n,n));
            }
            set.add(n);
        }return max;
    }
}