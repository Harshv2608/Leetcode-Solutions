class Solution {
    public String removeOuterParentheses(String s) {
        StringBuilder sb=new StringBuilder();
        int level=0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='('){
                if(level>0)sb.append('(');
                level++;
            }else{
                level--;
                if(level>0)sb.append(')');
            }            
        }
        return sb.toString();
    }
}