class Solution {
    public int numberOfSteps(int num) {
        int k=0;
        while(num>0){
            if(num%2==0){
                k++;
                num/=2;
            }else{
                k++;
                num-=1;
            }
        }
        return k;
    }
}