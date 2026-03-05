class Solution {
    public String trimTrailingVowels(String s) {
        int n=s.length();
        StringBuilder sb=new StringBuilder(s);
        for(int i=n-1;i>=0;i--){
            char c=s.charAt(i);
            if(c=='a'||c=='e'||c=='i'||c=='o'||c=='u'){
                sb.deleteCharAt(i);
            }else{
                break;
            }
        }return sb.toString();
    }
}