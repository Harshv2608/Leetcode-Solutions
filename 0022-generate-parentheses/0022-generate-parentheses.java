class Solution {
    public boolean isvalid(String s){
        int cnt=0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='(')cnt++;
            else cnt--;
            if(cnt<0)return false;
        }
        return cnt==0;
    }
    public void generate(String curr,List<String> ans,int n){
        if(curr.length()==2*n){
            if(isvalid(curr)){
                ans.add(curr);
            }
            return;
        }
        generate(curr+"(",ans,n);
        generate(curr+")",ans,n);
    }
    public List<String> generateParenthesis(int n) {
        List<String> ans=new ArrayList<>();
        generate("",ans,n);
        return ans;
    }
}