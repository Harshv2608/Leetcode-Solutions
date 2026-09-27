class Solution {
    public String reverseParentheses(String s) {
        Stack<String> st=new Stack<>();
        String curr="";
        for(char ch : s.toCharArray()){
            if(ch=='('){
                st.push(curr);
                curr="";
            }else if(ch==')'){
                curr=new StringBuilder(curr).reverse().toString();
                String prev=st.pop();
                curr=prev+curr;
            }else{
                curr=curr+ch;
            }
        }
        return curr;
    }
}