class Solution {
    public boolean consecutiveSetBits(int n) {
        String bits=Integer.toString(n,2);
        int count=0;
        char[] arr=bits.toCharArray();
        for(int i=1;i<arr.length;i++){
            if(arr[i]=='1' && arr[i-1]==arr[i]){
                count++;
            }
        }
        return count==1;
    }
}