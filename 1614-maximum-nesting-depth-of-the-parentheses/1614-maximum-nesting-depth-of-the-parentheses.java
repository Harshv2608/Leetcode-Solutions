class Solution {
    public int maxDepth(String s) {
        int max=0;
        int ans=0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='('){
                max++;
            }
            else if(s.charAt(i)==')'){
                max--;
            }
            else continue;
            ans=Math.max(ans,max);
        }
        return ans;
    }
}