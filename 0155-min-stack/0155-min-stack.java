class MinStack {
    private Stack<Integer> st;
    private Stack<Integer> min;
    public MinStack() {
        st=new Stack<>();
        min=new Stack<>();
    }
    
    public void push(int value) {
        st.push(value);
        if(min.isEmpty())min.push(value);
        else{
            if(value<=min.peek())min.push(value);
        }
    }
    
    public void pop() {
        if(st.peek().equals(min.peek())){
            min.pop();
        }st.pop();
    }
    
    public int top() {
        return st.peek();
    }
    
    public int getMin() {
        return min.peek();
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