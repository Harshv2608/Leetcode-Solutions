class Solution {
    public int maxDistinct(String s) {
        HashSet<Character> map=new HashSet<>();
        int count=0;
        for(int i=0;i<s.length();i++){
            if(map.contains(s.charAt(i))){
                continue;
            }else{
                map.add(s.charAt(i));
                count++;
            }
        }return count;
    }
}