class Solution {
    private int gcdof(int a ,int b){
        if(a==0)return b;
        return gcdof(b%a,a);
    }
    public int minOperations(int[] nums, int[] numsDivide) {
        int n=nums.length;
        int m=numsDivide.length;
        int gcd=numsDivide[0];
        for(int i=1;i<m;i++){
            gcd=gcdof(gcd,numsDivide[i]);
        }
        Arrays.sort(nums);
        for(int i=0;i<n;i++){
            if(gcd%nums[i]==0){
                return i;
            }
        }
        return -1;
    }
}