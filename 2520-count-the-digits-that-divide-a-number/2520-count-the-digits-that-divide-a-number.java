class Solution {
    public int countDigits(int num) {
        int soln=0;
        int x=num;
        while(num>0){
            int d=num%10;
            if(x%d==0){
                soln++;
            }
            num/=10;
        }
        return soln;
    }
}