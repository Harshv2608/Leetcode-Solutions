class Solution {
    public boolean isPowerOfThree(int n) {
        boolean soln=true;
        if(n<1){soln=false;}
        while(n>1){
            if(n%3!=0){
                soln=false;
            }
            n/=3;
        }
        return soln;
    }
}