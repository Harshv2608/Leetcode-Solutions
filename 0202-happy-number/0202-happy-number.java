class Solution {
    public boolean helper(int n, Set<Integer> num){
        int sum=0;
        while(n>0){
            int d=n%10;
            sum+=d*d;
            n/=10;
        }
        if(sum==1)return true;
        if(num.contains(sum))return false;
        else{
            num.add(sum);
        }
        return helper(sum,num);
    }
    public boolean isHappy(int n) {
        Set<Integer> num=new HashSet<>();
        return helper(n,num);
    }
}