class Solution {
    public boolean isSubsequence(String s, String t) {
        int l=0;
        int r=0;
        int m=s.length();
        int n=t.length();
        if(m==0)return true;
        while(r<n && l<m){
            if(s.charAt(l)==t.charAt(r)){
                l++;
            }
            r++;
        }
        return l==m;
    }
}