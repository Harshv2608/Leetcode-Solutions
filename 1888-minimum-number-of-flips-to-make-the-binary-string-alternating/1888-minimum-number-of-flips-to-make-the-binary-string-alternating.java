class Solution {
    public int minFlips(String s) {
        String doubled=s + s;
        int n=s.length();
        int diff1=0;
        int diff2=0;
        int ans=Integer.MAX_VALUE;
        for(int i=0;i<2*n;i++){
            char target1='0';
            char target2='1';
            char c=doubled.charAt(i);
            if(i%2==0){
                target1='0';
                target2='1';
            }else{
                target1='1';
                target2='0';
            }
            if(c!=target1)diff1++;
            if(c!=target2)diff2++;
            if(i>=n){
                char lc=doubled.charAt(i-n);
                char ltarget1='0';
                char ltarget2='0';
                if((i-n)%2==0){
                    ltarget1='0';
                    ltarget2='1';
                }else{
                    ltarget1='1';
                    ltarget2='0';
                }if(lc!=ltarget1)diff1--;
                if(lc!=ltarget2)diff2--;
            }
            if(i>=n-1){
                ans=Math.min(ans,Math.min(diff1,diff2));
            }
        }
        return ans;
    }
}