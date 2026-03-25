class Solution {
    public long calculatehours(int[] piles,int hour){
        long total=0;
        for(int i: piles){
            total+=Math.ceil((double)i/hour);
        }
        return total;
    }
    public int minEatingSpeed(int[] piles, int h) {
        int max=Arrays.stream(piles).max().getAsInt();
        int low=1;
        int high=max;
        int ans=max;
        while(low<=high){
            int mid=(low+high)/2;
            long hours=calculatehours(piles,mid);
            if(hours<=h){
                ans=mid;
                high=mid-1;
            }else{
                low=mid+1;
            }
        }
        return ans;
    }
}