class Solution {
    public boolean checkGoodInteger(int n) {
        int d=0;
        int s=0;
        while(n>0){
            int x=n%10;
            d+=x;
            s+=x*x;
            n/=10;
        }
        return s-d>=50;
    }
}