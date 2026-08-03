class Solution {
    String b;
    HashMap<String,Integer> map;
    List<List<String>> ans;
    public void dfs(String word, List<String> seq){
        if(word.equals(b)){
            List<String> dup=new ArrayList<>(seq);
            Collections.reverse(dup);
            ans.add(dup);
            return;
        }
        int step=map.get(word);
        int sz=word.length();
        for(int i=0;i<sz;i++){
            char[] rarr=word.toCharArray();
            for(char ch='a';ch<='z';ch++){
                rarr[i]=ch;
                String rword=new String(rarr);
                if(map.containsKey(rword) && map.get(rword)+1 == step){
                    seq.add(rword);
                    dfs(rword,seq);
                    seq.remove(seq.size()-1);
                }
            }
        }
    }
    public List<List<String>> findLadders(String beginWord, String endWord, List<String> wordList) {
        int n=wordList.size();
        b=beginWord;
        map=new HashMap<>();
        map.put(beginWord,1);
        Queue<String> q=new LinkedList<>();
        Set<String> st=new HashSet<>();
        for(int i=0;i<n;i++){
            st.add(wordList.get(i));
        }
        int sz=b.length();
        q.add(beginWord);
        st.remove(beginWord);
        while(!q.isEmpty()){
            String word=q.peek();
            int step=map.get(word);
            q.poll();
            if(word.equals(endWord))break;
            for(int i=0;i<sz;i++){
                char[] replacearr=word.toCharArray();
                for(char ch='a';ch<='z';ch++){
                    replacearr[i]=ch;
                    String replaceWord=new String(replacearr);
                    if(st.contains(replaceWord)){
                        q.add(replaceWord);
                        st.remove(replaceWord);
                        map.put(replaceWord,step+1);
                    }
                }
            }
        }
        ans=new ArrayList<>();
        if(map.containsKey(endWord)){
            List<String> seq=new ArrayList<>();
            seq.add(endWord);
            dfs(endWord,seq);
        }
        return ans;
    }
}