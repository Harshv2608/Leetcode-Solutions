class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer> st=new Stack<>();
        for(int i=0;i<tokens.length;i++){
            String t=tokens[i];
            if(!t.equals("+") && !t.equals("-") && !t.equals("*") && !t.equals("/")){
                st.push(Integer.parseInt(t));
            }
            else{
                int a = st.pop();
                int b = st.pop();

                if(t.equals("+")) st.push(b + a);
                else if(t.equals("-")) st.push(b - a);
                else if(t.equals("*")) st.push(b * a);
                else st.push(b / a);
            }
        }
        return st.pop();
    }
}