class Solution {
    public int minimumPushes(String word) {
        if(word.length()<=8)return word.length();
        else if(word.length()<=16) return 2*word.length()-8;
        else if(word.length()<=24) return 24+3*(word.length()-16);
        return 48+4*(word.length()-24);
    }
}