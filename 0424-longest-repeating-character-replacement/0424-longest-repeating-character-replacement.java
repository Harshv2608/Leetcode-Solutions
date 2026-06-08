class Solution {
    public int characterReplacement(String s, int k) {
        Map<Character,Integer> map=new HashMap<>();
        int l=0;
        int r=0;
        int maxf=0;
        int res=0;
        while(r<s.length()){
            map.put(s.charAt(r),map.getOrDefault(s.charAt(r),0)+1);
            maxf=Math.max(maxf,map.get(s.charAt(r)));
            while(r-l+1-maxf > k){
                map.put(s.charAt(l),map.get(s.charAt(l))-1);
                l++;
            }
            res=Math.max(res,r-l+1);
            r++;
        }return res;
    }
}