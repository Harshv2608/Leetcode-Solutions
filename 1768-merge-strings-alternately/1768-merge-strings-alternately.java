class Solution {
    public String mergeAlternately(String word1, String word2) {
        StringBuilder sb=new StringBuilder();
        int l=0;
        int r=0;
        while(l<word1.length() && r<word2.length()){
            sb.append(word1.charAt(l));
            sb.append(word2.charAt(r));
            l++;
            r++;
        }while(l<word1.length()){
            sb.append(word1.charAt(l));
            l++;
        }while(r<word2.length()){
            sb.append(word2.charAt(r));
            r++;
        }
        return sb.toString();
    }
}