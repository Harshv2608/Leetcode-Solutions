class Solution {
    public int characterReplacement(String s, int k) {
        int[] freq=new int[26];
        int l=0;
        int maxf=0;
        int res=0;
        int n=s.length();
        for(int r=0;r<n;r++){
            char c=s.charAt(r);
            freq[c-'A']++;
            maxf=Math.max(maxf,freq[c-'A']);
            while(r-l+1-maxf > k){
                freq[s.charAt(l)-'A']--;
                l++;
            }
            res=Math.max(res,r-l+1);
        }return res;
    }
}