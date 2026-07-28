class Solution {
    public int climbStairs(int n) {
        int prev2=1;
        int prev=1;
        int curr=0;
        for(int i=2;i<=n;i++){
            curr=prev+prev2;
            prev2=prev;
            prev=curr;
        }
        return prev;
    }
}