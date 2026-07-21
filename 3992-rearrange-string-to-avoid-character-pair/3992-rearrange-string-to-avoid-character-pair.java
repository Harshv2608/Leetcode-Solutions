class Solution {
    public String rearrangeString(String s, char x, char y) {
        StringBuilder ys=new StringBuilder();
        StringBuilder xs=new StringBuilder();
        StringBuilder others=new StringBuilder();
        for(char c : s.toCharArray()){
            if(c==y){
                ys.append(c);
            }else if(c==x){
                xs.append(c);
            }else{
                others.append(c);
            }
        }return ys.append(others).append(xs).toString();
    }
}