class Solution {
    public int carFleet(int target, int[] position, int[] speed) {
        int n=position.length;
        int[][] pair=new int[n][2];
        for(int i=0;i<n;i++){
            pair[i][0]=position[i];
            pair[i][1]=speed[i];
        }
        Stack<Double> st=new Stack<>();
        Arrays.sort(pair,(a,b)-> Integer.compare(b[0],a[0]));
        for(int[] p : pair){
            st.push((double)(target-p[0])/p[1]);
            if(st.size()>=2 && st.peek()<=st.get(st.size()-2)){
                st.pop();
            }
        }return st.size();
    }
}