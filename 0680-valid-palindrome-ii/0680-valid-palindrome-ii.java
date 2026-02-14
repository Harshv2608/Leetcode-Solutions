class Solution {
    public boolean validPalindrome(String s) {
        int left=0;
        int right=s.length()-1;
        while(left<=right){
            if(s.charAt(left)!=s.charAt(right)){
                return isvalid(s,left+1,right) || isvalid(s,left,right-1);
            }
            left++;
            right--;
        }
        return true;
    }
    public boolean isvalid(String s,int left,int right){
        boolean soln=true;
        while(left<=right){
            if(s.charAt(left)==s.charAt(right)){
                left++;
                right--;
            }
            else{
                soln=false;
                break;
            }
        }
        return soln;
    }
}