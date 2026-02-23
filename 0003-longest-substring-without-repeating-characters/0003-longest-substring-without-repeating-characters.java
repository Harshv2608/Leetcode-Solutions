class Solution {
    public int lengthOfLongestSubstring(String s) {
        int n=s.length();
        HashSet<Character> x=new HashSet<>();
        int max=0;
        int left=0;
        for(int right=0;right<n;right++){
            while(x.contains(s.charAt(right))){
                x.remove(s.charAt(left));
                left++;
            }
            x.add(s.charAt(right));
            max=Math.max(max,right-left+1);
        }
        return max;
    }
}