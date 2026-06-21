class Solution {
    public int digitFrequencyScore(int n) {
        int[] count=new int[10];
        while(n>0){
            int d=n%10;
            count[d]++;
            n/=10;
        }
        int res=0;
        for(int i=1;i<10;i++){
            res+=count[i]*i;
        }return res;
    }
}