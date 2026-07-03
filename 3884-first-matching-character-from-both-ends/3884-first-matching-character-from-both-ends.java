class Solution {
    public int firstMatchingIndex(String s) {
        int i=0;
        int j=s.length()-1;
        while(i<=j){
            if(s.charAt(i)==s.charAt(j))return i;
            else{
                i++;
                j--;
            }
        }return -1;
    }
}