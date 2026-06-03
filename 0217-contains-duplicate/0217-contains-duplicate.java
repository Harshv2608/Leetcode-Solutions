class Solution {
    public boolean containsDuplicate(int[] nums) {
        HashSet<Integer> x=new HashSet<>();
        for(int num : nums){
           if(x.contains(num)){
            return true;
           } x.add(num);
        }return false;  
    }
}