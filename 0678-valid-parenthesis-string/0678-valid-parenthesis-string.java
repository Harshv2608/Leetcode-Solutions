class Solution {
    public boolean checkValidString(String s) {
        int min=0;
        int max=0;
        for(int i=0;i<s.length();i++){
            char c=s.charAt(i);
            if(c=='('){
                min++;
                max++;
            }else if(c==')'){
                min--;
                max--;
            }else{
                min--;
                max++;
            }
            if(max<0)return false;
            if(min<0)min=0;
        }
        return min==0;
    }
}