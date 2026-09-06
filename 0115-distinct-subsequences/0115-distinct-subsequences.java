class Solution {
    public int solve(int i,int j,String s,String t,int[][] dp){
        if(j==t.length())return 1;
        if(i==s.length())return 0;
        if(dp[i][j]!=-1)return dp[i][j];
        int take=solve(i+1,j+1,s,t,dp);
        int skip=solve(i+1,j,s,t,dp);
        if(s.charAt(i)==t.charAt(j)){
            return dp[i][j]=take+skip;
        }
        return dp[i][j]=skip;
    }
    public int numDistinct(String s, String t) {
        int[][] dp=new int[s.length()][t.length()];
        for(int i=0;i<s.length();i++){
            for(int j=0;j<t.length();j++){
                dp[i][j]=-1;
            }
        }
        return solve(0,0,s,t,dp); 
    }
}