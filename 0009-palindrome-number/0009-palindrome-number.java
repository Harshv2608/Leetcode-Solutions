class Solution {
    public boolean isPalindrome(int x) {
        int rev=0;
        int a=x;
        while(x>0){
            int d=x%10;
            rev=rev*10+d;
            x/=10;
        }
        return (rev==a);
    }
}