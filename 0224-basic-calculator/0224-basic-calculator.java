class Solution {
    public int calculate(String s) {
        int n=s.length();
        Stack<Integer> st=new Stack<>();
        int result=0;
        int sign=1;
        int num=0;
        for(int i=0;i<n;i++){
            char c=s.charAt(i);
            if(Character.isDigit(c)){
                num=num*10+(c-'0');
            }else if(c=='+'){
                result+=sign*num;
                sign=1;
                num=0;
            }else if(c=='-'){
                result+=sign*num;
                sign=-1;
                num=0;
            }else if(c=='('){
                st.push(result);
                st.push(sign);
                result=0;
                sign=1;
            }
            else if(c==')'){
                result+=sign*num;
                num=0;
                result*=st.pop();//sign
                result+=st.pop();//previous result
            }
        }result+=sign*num;
        return result;
    }
}