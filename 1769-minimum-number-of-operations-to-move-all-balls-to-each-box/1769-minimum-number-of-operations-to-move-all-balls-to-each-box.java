class Solution {
    public int[] minOperations(String boxes) {
        char[] c=boxes.toCharArray();
        int n=c.length;
        int[] soln=new int[n];
        for(int i=0;i<n;i++){
            int sum=0;
            for(int j=0;j<n;j++){
                if(c[j]=='1'){
                    sum+=Math.abs(j-i);
                }
            }
            soln[i]=sum;
        }
        return soln;
    }
}