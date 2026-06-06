class Solution {
    public int maxProfit(int[] prices) {
        int max=0;
        int min=prices[0];
        for(int i : prices){
            min=Math.min(i,min);
            max=Math.max(i-min,max);
        }
        return max;
    }
}