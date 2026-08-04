class Solution {
    public int gcd(int a,int b){
        while(a>0 && b>0){
            if(a>b){
                a%=b;
            }else{
                b%=a;
            }
        }
        if(a==0)return b;
        return a;
    }
    public long maxPairStrength(int[] nums) {
        int n=nums.length;
        long max=0;
        for(int i=0;i<n-1;i++){
            for(int j=i+1;j<n;j++){
                long mul=(long) nums[i]*nums[j];
                int gcd=gcd(nums[i],nums[j]);
                long ans=mul/gcd;
                ans/=gcd;
                max=Math.max(ans,max);
            }
        }
        return max;
    }
}