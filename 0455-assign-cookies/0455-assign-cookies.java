class Solution {
    public int findContentChildren(int[] g, int[] s) {
        Arrays.sort(g);
        Arrays.sort(s);
        int left=0;
        int right=0;
        int m=g.length;
        int n=s.length;
        while(left<m && right<n){
            if(g[left]<=s[right]){
                left++;
            }
            right++;
        }
        return left;
    }
}