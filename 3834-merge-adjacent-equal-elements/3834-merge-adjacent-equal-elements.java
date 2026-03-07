class Solution {
    public List<Long> mergeAdjacent(int[] nums) {
        int n=nums.length;
        Stack<Long> soln=new Stack<>();
        for(int i=0;i<n;i++){
            long curr=nums[i];
            while(!soln.empty() && soln.peek()==curr){
                curr=soln.pop()+curr;
            }
            soln.push(curr);
        }
        List<Long> arr = new ArrayList<>(soln);
        return arr;
    }
}