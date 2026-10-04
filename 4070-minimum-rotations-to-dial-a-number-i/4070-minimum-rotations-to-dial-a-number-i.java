class Solution {
    public int minRotations(String s) {
        int prev=0;
        int sum=0;
        for(int i=0;i<s.length();i++){
            int c=s.charAt(i)-'0';
            int diff=Math.abs(c-prev);
            if(diff>5)diff=10-diff;
            sum+=diff;
            prev=c;
        }
        return sum;
    }
}