class Solution {
    public int sumDecoded(long[] nums) {
        long sum=0;
        long mod=1_000_000_007L;
        for(long num:nums){
            int w=(int)(num%10);
            num/=10;
            String s=String.valueOf(num);
            long x=Long.parseLong(s.substring(0,w));
            long y=Long.parseLong(s.substring(w));
            long ans=modPow(x,y,mod);
            sum=(ans+sum)%mod;
        }
        return (int)sum;
    }
    long modPow(long x,long y,long mod){
        long res=1;
        x=x%mod;
        while(y!=0){
            if(y%2==1){
                res=(res*x)%mod;
            }
            x=(x*x)%mod;
            y/=2;
        }
        return res;
    }
}