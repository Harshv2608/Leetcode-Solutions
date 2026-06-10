class MinStack {
    long min;
    Stack<Long> st;
    public MinStack() {
        st=new Stack<>();
    }
    
    public void push(int value) {
        if(st.isEmpty()){
            st.push(0L);
            min=value;
        }else{
            st.push(value-min);
            if(value<min)min=value;
        }
    }
    
    public void pop() {
        if(st.isEmpty())return;
        long pop=st.pop();
        if(pop<0)min=min-pop;
    }
    
    public int top() {
        long top=st.peek();
        if(top>0){
            return (int)(min+top);
        }else{
            return (int)min;
        }
    }
    
    public int getMin() {
        return (int)min;
    }
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(value);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */