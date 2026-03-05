class Solution {
    public int minOperations(String s) {
        int n=s.length();
        if(n==1)return 0;
        int cnt1=0;
        int cnt2=0;
        for(int i=0;i<n;i++){
            char c=s.charAt(i);
            if(i%2==0){
                if(c!='0')cnt1++;
            }else{
                if(c!='1')cnt1++;
            }
            if(i%2==0){
                if(c!='1')cnt2++;
            }else{
                if(c!='0')cnt2++;
            }
        }
        return Math.min(cnt1,cnt2);
    }
}