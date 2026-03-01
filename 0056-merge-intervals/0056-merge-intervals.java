class Solution {
    public int[][] merge(int[][] intervals) {
        Arrays.sort(intervals,(a,b) -> a[0]-b[0]);
        List<List<Integer>> ans=new ArrayList<>();
        int n=intervals.length;
        int i=0;
        while(i<n){
            int start=intervals[i][0];
            int end=intervals[i][1];
            int j=i+1;
            while(j<n && intervals[j][0]<=end){
                end=Math.max(end,intervals[j][1]);
                j++;
            }
            ans.add(Arrays.asList(start,end));
            i=j;
        }
        int[][] result = new int[ans.size()][2];

        for(int k = 0; k < ans.size(); k++){
            result[k][0] = ans.get(k).get(0);
            result[k][1] = ans.get(k).get(1);
        }

        return result;
    }
}