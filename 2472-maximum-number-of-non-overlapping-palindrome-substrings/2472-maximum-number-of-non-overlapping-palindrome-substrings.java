class Solution {
    public boolean check(int l,int r, String s){
        while(l<r){
            if(s.charAt(l)!=s.charAt(r))return false;
            l++;
            r--;
        }
        return true;
    }
    public int maxPalindromes(String s, int k) {
        int n=s.length();
        int ans=0;
        int start=0;
        for(int r=k-1;r<n;r++){
            for(int len=k;len<=r-start+1;len++){
                int l=r-len+1;
                if(check(l,r,s)){
                    start=r+1;
                    ans++;
                    break;
                }
            }
        }
        return ans;
    }
}