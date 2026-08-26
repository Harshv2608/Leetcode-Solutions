class Solution {
    public int missingMultiple(int[] nums, int k) {
        Set<Integer> st=new HashSet<>();
        for(int n:nums){
            st.add(n);
        }
        int ans=k;
        for(int i=k;;i+=k){
            if(!st.contains(i)){
                ans=i;
                break;
            }
        }
        return ans;

    }
}