class Solution {
    public int addDigits(int num) {
        int x=0;
        while(num>0){
            x+=num%10;
            num/=10;
        }
        if(x<10){
            return x;
        }return addDigits(x);
    }
}