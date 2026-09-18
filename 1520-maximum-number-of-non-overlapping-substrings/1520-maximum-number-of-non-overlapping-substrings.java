class Solution {
    public List<String> maxNumOfSubstrings(String s) {
        int n=s.length();
        int[] first=new int[26];
        int[] last=new int[26];
        Arrays.fill(first,n);
        Arrays.fill(last,-1);
        for(int i=0;i<n;i++){
            int c=s.charAt(i)-'a';
            first[c]=Math.min(first[c],i);
            last[c]=i;
        }
        List<int[]> intervals=new ArrayList<>();
        for(int c=0;c<26;c++){
            if(last[c]==-1){
                continue;
            }
            int start=first[c];
            int end=last[c];
            boolean valid=true;
            for(int i=start;i<end;i++){
                int current=s.charAt(i)-'a';
                if(first[current]<start){
                    valid=false;
                    break;
                }
                end=Math.max(end,last[current]);
            }
            if(valid){
                intervals.add(new int[]{start,end});
            }
        }
        intervals.sort((a,b) -> Integer.compare(a[1],b[1]));
        List<String> sol=new ArrayList<>();
        int prevend=-1;
        for(int[] interval:intervals){
            int start=interval[0];
            int end=interval[1];
            if(start>prevend){
                sol.add(s.substring(start,end+1));
                prevend=end;
            }
        }
        return sol;
    }
}