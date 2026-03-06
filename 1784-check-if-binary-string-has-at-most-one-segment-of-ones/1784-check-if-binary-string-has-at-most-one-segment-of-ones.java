class Solution {
    public boolean checkOnesSegment(String s) {
        int n=s.length();
        if(n==1 || n==2 || n==0)return true;
        int count=0;
        int i=1;
        while(i<n){
            if(s.charAt(i)=='1' && s.charAt(i)!=s.charAt(i-1)){
                count++;
                i++;
            }i++;
        }return (count==0);
    }
}