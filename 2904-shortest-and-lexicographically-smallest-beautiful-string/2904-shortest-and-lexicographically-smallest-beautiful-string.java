class Solution {
    public String shortestBeautifulSubstring(String s, int k) {
        int min=s.length()+1;
        int start=-1;
        int end=-1;
        for(int i=0;i<s.length();i++){
            int cnt=0;
            for(int j=i;j<s.length();j++){
                if(s.charAt(j)=='1')cnt++;
                if(cnt==k){
                    if(j-i+1 <min){
                        min=j-i+1;
                        start=i;
                        end=j;
                    }
                    else if(j-i+1==min){
                        if(s.substring(start,end).compareTo(s.substring(i,j))>0){
                            start=i;
                            end=j;
                        }
                    }
                }
            }
        }
        if(start==-1)return "";
        return s.substring(start,end+1);
    }
}