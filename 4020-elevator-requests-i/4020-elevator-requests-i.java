class Solution {
    public int elevatorRequests(int n, int[] requests) {
        int sum=requests[0];
        for(int i=1;i<requests.length;i++){
            sum+=Math.abs(requests[i]-requests[i-1]);
        }
        return sum;
    }
}