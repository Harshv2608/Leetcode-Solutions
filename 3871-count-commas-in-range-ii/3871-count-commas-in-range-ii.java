class Solution {
    public long countCommas(long n) {
        long one=999999L-1000L+1;
        long two=999999999L-1000000L+1;
        long three=999999999999L-1000000000L+1;
        long four=999999999999999L-1000000000000L+1;
        long five=1;
        if(n<1000)return 0;
        else if(n>=1000L && n<=999999L)return n-1000L+1;
        else if(n>=1000000L && n<=999999999L)return 2*(n-1000000L+1)+one;
        else if(n>=1000000000L && n<=999999999999L)return 3*(n-1000000000L+1)+2*two+one;
        else if(n>=1000000000000L && n<=999999999999999L) return 4*(n-1000000000000L+1)+one+2*two+3*three;
        else return one+2*two+3*three+4*four+5*five;  
    }
}