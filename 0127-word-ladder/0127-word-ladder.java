class Pair{
    String first;
    int second;
    public Pair(String first,int second){
        this.first=first;
        this.second=second;
    }
}
class Solution {
    public int ladderLength(String beginWord, String endWord, List<String> wordList) {
        Queue<Pair> q=new LinkedList<>();
        q.add(new Pair(beginWord,1));
        Set<String> st=new HashSet<>();
        for(String x:wordList){
            st.add(x);
        }
        st.remove(beginWord);
        while(!q.isEmpty()){
            String word=q.peek().first;
            int step=q.peek().second;
            q.poll();
            if(word.equals(endWord))return step;
            for(int i=0;i<word.length();i++){
                char[] replaceArr=word.toCharArray();
                for(char ch='a';ch<='z';ch++){
                    replaceArr[i]=ch;
                    String replaceString=new String(replaceArr);
                    if(st.contains(replaceString)){
                        st.remove(replaceString);
                        q.add(new Pair(replaceString,step+1));
                    }
                }
            }
        }
        return 0;
    }
}