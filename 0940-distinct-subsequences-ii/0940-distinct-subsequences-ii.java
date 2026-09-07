class Solution {
    public int distinctSubseqII(String s) {
        int n=s.length();
        int[] dp=new int[n+1];
        dp[0]=1;
        Map<Character,Integer> last=new HashMap<>();
        int mod=1000000007;
        for(int i=1;i<n+1;i++){
            char ch=s.charAt(i-1);
            dp[i]=(dp[i-1]*2)%mod;
            if(last.containsKey(ch)){
                int j=last.get(ch);
                dp[i]=(dp[i]-dp[j-1]+mod)%mod;
            }
            last.put(ch,i);
        }
        return (dp[n]-1+mod)%mod;
    }
}