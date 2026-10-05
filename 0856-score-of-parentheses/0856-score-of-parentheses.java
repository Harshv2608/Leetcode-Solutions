class Solution {
    public int scoreOfParentheses(String s) {
        Stack<Integer> st=new Stack<>();
        st.push(0);
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='('){
                st.push(0);
            }else{
                int top1=st.pop();
                int top2=st.pop();
                int ans=top2+Math.max(2*top1,1);
                st.push(ans);
            }
        }
        return st.pop();
    }
}