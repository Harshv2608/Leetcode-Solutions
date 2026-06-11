class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        int n=temperatures.length;
        Stack<int[]> st=new Stack<>();
        int[] res=new int[n];
        for(int i=0;i<n;i++){
            int t=temperatures[i];
            while(!st.isEmpty() && t>st.peek()[0]){
                int[] pair=st.pop();
                res[pair[1]]=i-pair[1];
            }st.push(new int[]{t,i});
        }return res;
    }
}