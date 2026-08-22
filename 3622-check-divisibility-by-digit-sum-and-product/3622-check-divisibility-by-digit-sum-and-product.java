class Solution {
    public boolean checkDivisibility(int n) {
        int sum=0;
        int prod=1;
        int num=n;
        while(num>0){
            int d=num%10;
            sum+=d;
            prod*=d;
            num/=10;
        }return n%(sum+prod)==0;
    }
}