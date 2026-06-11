class Solution {
    public int carFleet(int target, int[] position, int[] speed) {
        int n=position.length;
        double[][] pair=new double[n][2];
        for(int i=0;i<n;i++){
            pair[i][0]=position[i];
            pair[i][1]=(double)(target-position[i])/speed[i];
        }
        Arrays.sort(pair,(a,b)-> Double.compare(b[0],a[0]));
        int count=0;
        double prev=0;
        for(double[] p : pair){
            if(p[1]>prev){
                count++;
                prev=p[1];
            }
        }return count;
    }
}