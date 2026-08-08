class Solution {
    public int minCostClimbingStairs(int[] cost) {
        int n=cost.length;
        int prev=0;
        int prev2=Integer.MAX_VALUE;
        for(int i=n-1;i>=0;i--){
            int curr=cost[i] + Math.min(prev,prev2);
            prev2=prev;
            prev=curr;
        }
        return Math.min(prev2,prev);
    }
}