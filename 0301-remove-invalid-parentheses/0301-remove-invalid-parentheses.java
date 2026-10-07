class Solution {
    public boolean isValid(String s){
        int n=s.length();
        int cnt=0;
        for(int i=0;i<n;i++){
            if(s.charAt(i)=='('){
                cnt++;
            }else if(s.charAt(i)==')'){
                cnt--;
            }
            if(cnt<0)return false;
        }
        return cnt==0;
    }
    public List<String> removeInvalidParentheses(String s) {
        List<String> ans=new ArrayList<>();
        Queue<String> q=new LinkedList<>();
        Set<String> vis=new HashSet<>();
        boolean found=false;
        q.offer(s);
        vis.add(s);
        while(!q.isEmpty()){
            int size=q.size();
            for(int i=0;i<size;i++){
                String curr=q.poll();
                if(isValid(curr)){
                    found=true;
                    ans.add(curr);
                }
                if(found)continue;
                for(int j=0;j<curr.length();j++){
                    char ch=curr.charAt(j);
                    if(ch!='(' && ch!=')'){
                        continue;
                    }
                    String next=curr.substring(0,j)+curr.substring(j+1);
                    if(!vis.contains(next)){
                        vis.add(next);
                        q.offer(next);
                    }
                }
            }
            if(found){
                break;
            }
        }
        return ans;
    }
}