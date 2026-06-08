class Solution {
    public String minWindow(String s, String t) {
        if(t.isEmpty())return "";
        Map<Character,Integer> map=new HashMap<>();
        Map<Character,Integer> window=new HashMap<>();
        for(char c : t.toCharArray()){
            map.put(c,map.getOrDefault(c,0)+1);
        }
        int have=0;
        int need=map.size();
        int reslen=Integer.MAX_VALUE;
        int[] res={-1,-1};
        int l=0;
        for(int r=0;r<s.length();r++){
            char rc=s.charAt(r);
            window.put(rc,window.getOrDefault(rc,0)+1);
            if(map.containsKey(rc) && map.get(rc).equals(window.get(rc))){
                have++;
            }
            while(have==need){
                if(r-l+1<reslen){
                    reslen=r-l+1;
                    res[0]=l;
                    res[1]=r;
                }
                char lc=s.charAt(l);
                window.put(lc,window.get(lc)-1);
                if(map.containsKey(lc) && map.get(lc) > window.get(lc)){
                    have--;
                }
                l++;
            }
        }return reslen==Integer.MAX_VALUE ? "" : s.substring(res[0],res[1]+1);
    }
}