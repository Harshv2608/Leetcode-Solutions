class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> triangle=new ArrayList<>();
        for(int i=1;i<=numRows;i++){
            int ans=1;
            List<Integer> temp=new ArrayList<>();
            temp.add(ans);
            for(int j=1;j<i;j++){
                ans=ans*(i-j);
                ans/=j;
                temp.add(ans);
            }
            triangle.add(temp);
        }
        return triangle;
    }
}