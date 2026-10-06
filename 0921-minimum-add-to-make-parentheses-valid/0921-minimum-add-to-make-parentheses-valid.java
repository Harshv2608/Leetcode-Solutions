class Solution {
    public int minAddToMakeValid(String s) {
        int cnt=0;
        Stack<Character> st=new Stack<>();
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='('){
                st.push('(');
            }else{
                if(!st.isEmpty()){
                    st.pop();
                }else{
                    cnt++;
                }
            }
        }
        return st.size()+cnt;
    }
}