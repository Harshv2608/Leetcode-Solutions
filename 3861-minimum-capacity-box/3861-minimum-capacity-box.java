class Solution {
    public int minimumIndex(int[] capacity, int itemSize) {
        int n=capacity.length;
        int ans=-1;
        int min=Integer.MAX_VALUE;
        for(int i=0;i<n;i++){
            if(capacity[i]>=itemSize){
                if(capacity[i]<min){
                    min=capacity[i];
                    ans=i;
                }
            }
        }
        return ans;
    }
}