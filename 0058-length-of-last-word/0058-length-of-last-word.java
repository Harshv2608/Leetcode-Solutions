class Solution {
    public int lengthOfLastWord(String s) {
        int cnt=0;
        int i=s.length()-1;
        while(i>=0 && s.charAt(i)==' '){
            i--;
        }
        while(i>=0 && s.charAt(i)!=' '){
            cnt++;
            i--;
        }
        return cnt;
    }
}