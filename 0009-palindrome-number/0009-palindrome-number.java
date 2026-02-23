class Solution {
    public boolean isPalindrome(int x) {
        int rev=0;
        int a=x;
        if(x>0){
            while(x!=0){
                int n=x%10;
                rev=rev*10+n;
                x/=10;
            }
            if(a==rev){return true;}
            else{return false;}
        }else if(x<0){return false;}
        else{return true;}
    }
}