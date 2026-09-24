class Solution {
    public String reverseWords(String s) {
        int n=s.length();
        StringBuilder sb=new StringBuilder();
        int i=n-1;
        while(i>=0){
            while(i>=0 && s.charAt(i)==' '){
                i--;
            }
            if(i<0)break;
            int end=i;
            while(i>=0 && s.charAt(i)!=' '){
                i--;
            }
            if(sb.length()>0){
                sb.append(" ");
            }
            sb.append(s.substring(i+1,end+1));
        }
        return sb.toString();
    }
}