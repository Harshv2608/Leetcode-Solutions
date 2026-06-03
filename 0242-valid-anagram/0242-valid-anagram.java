class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length()!=t.length()){
            return false;
        }
        HashMap<Character,Integer> scount=new HashMap<>();
        HashMap<Character,Integer> tcount=new HashMap<>();     
        for(int i=0;i<s.length();i++){
            scount.put(s.charAt(i),scount.getOrDefault(s.charAt(i),0)+1);
            tcount.put(t.charAt(i),tcount.getOrDefault(t.charAt(i),0)+1);
        }
        return scount.equals(tcount);  
    }
}