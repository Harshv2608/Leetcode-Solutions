class Solution {
    public int calculate(int[] piles,int n,int k){
        int total=0;
        for(int i=0;i<n;i++){
            total+=Math.ceil((double)piles[i]/(double)k);
        }
        return total;
    }
    public int minEatingSpeed(int[] piles, int h) {
        int n=piles.length;
        int max=0;
        for(int i=0;i<n;i++){
            max=Math.max(max,piles[i]);
        }
        int low=1;
        int high=max;
        int ans=high;
        while(low<=high){
            int mid=low+(high-low)/2;
            int reqtime=calculate(piles,n,mid);
            if(reqtime<=h){
                ans=mid;
                high=mid-1;
            }else{
                low=mid+1;
            }
        }return ans;
    }
}