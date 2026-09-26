class Solution {
    public String evaluate(String s, List<List<String>> knowledge) {
        Map<String,String> map=new HashMap<>();
        int n=s.length();
        for(List<String> x:knowledge){
            map.put(x.get(0),x.get(1));
        }
        StringBuilder res=new StringBuilder();
        int i=0;
        while(i<n){
            if(Character.isLetter(s.charAt(i))){
                res.append(s.charAt(i));
            }else{
                i++;
                StringBuilder temp=new StringBuilder();
                while(i<n && s.charAt(i)!=')'){
                    temp.append(s.charAt(i));
                    i++;
                }
                String key=temp.toString();
                if(map.containsKey(key)){
                    res.append(map.get(key));
                }else{
                    res.append("?");
                }
            }
            i++;
        }
        return res.toString();
    }
}