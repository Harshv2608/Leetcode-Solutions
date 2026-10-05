class Solution {
    public int maxScore(int[] cardPoints, int k) {
        int n=cardPoints.length;
        int size=n-k;
        int totalsum=0;
        int wsum=0;
        for(int a:cardPoints){
            totalsum+=a;
        }
        for(int i=0;i<n-k;i++){
            wsum+=cardPoints[i];
        }
        int min=wsum;
        for(int i=1;i<=k;i++){
            wsum-=cardPoints[i-1];
            wsum+=cardPoints[i+size-1];
            min=Math.min(min,wsum);
        }
        return totalsum-min;
    }
}