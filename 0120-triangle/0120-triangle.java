class Solution {
   
    public int minimumTotal(List<List<Integer>> triangle) {
        int n=triangle.size();
        int[] front=new int[n];
        for(int j=0;j<n;j++){
            front[j]=triangle.get(n-1).get(j);
        }
        for(int i=n-2;i>=0;i--){
            int[] curr=new int[i+1];
            for(int j=0;j<=i;j++){
                int down=front[j];
                int diagonal=front[j+1];
                curr[j]=triangle.get(i).get(j)+Math.min(down,diagonal);
            }
            front=curr;
        }
        return front[0];
    }
}