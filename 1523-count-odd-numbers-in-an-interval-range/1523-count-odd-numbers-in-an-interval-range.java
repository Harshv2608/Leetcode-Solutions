class Solution {
    public int countOdds(int low, int high) {
        int odd=0;
        if(low%2!=0){
            odd=((high-low)/2)+1;
        }else{
            if(high%2==0){
            odd=(high-low)/2;}
            else{
                odd=((high-low)/2)+1;
            }
        }
        return odd;
    }
}