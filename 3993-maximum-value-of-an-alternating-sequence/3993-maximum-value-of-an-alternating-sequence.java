class Solution {
    public long maximumValue(int n, int s, int m) {
        if(n==1)return s;
        long ans=0;
        if(n%2!=0){
            ans=(long)(n/2)*(m-1)+1;
        }else{
            long k=(n/2)-1;
            ans=k*(m-1)+m;
        }
        return (long)s+ans;
    }
}