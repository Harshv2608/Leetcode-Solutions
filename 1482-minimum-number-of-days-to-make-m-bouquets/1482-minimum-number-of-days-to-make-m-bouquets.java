class Solution {
    public boolean possible(int[] arr,int n, int m,int k,int day){
        int cnt=0;
        int poss=0;
        for(int x: arr){
            if(x<=day){
                cnt++;
                if(cnt==k){
                    poss++;
                    cnt=0;
                }
            }else{
                cnt=0;
            }
        }return (poss>=m);
    }
    public int minDays(int[] bloomDay, int m, int k) {
        long required=m*k;
        int n=bloomDay.length;
        if(required>n)return -1;
        int max=Integer.MIN_VALUE;
        int min=Integer.MAX_VALUE;
        for(int x : bloomDay){
            max=Math.max(x,max);
            min=Math.min(x,min);
        }
        int low=min;
        int high=max;
        int res=-1;
        while(low<=high){
            int mid=low+(high-low)/2;
            if(possible(bloomDay,n,m,k,mid)){
                res=mid;
                high=mid-1;
            }else{
                low=mid+1;
            }
        }return res;
    }
}