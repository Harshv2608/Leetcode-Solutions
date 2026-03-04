class Solution {
    public int numSpecial(int[][] mat) {
        int m=mat.length;
        int n=mat[0].length;
        int col=0;
        int[] row_c=new int[m];
        int[] col_c=new int[n];
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(mat[i][j]==1){
                    row_c[i]++;
                    col_c[j]++;
                }
            }
        }
        int count=0;
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(mat[i][j]==1){
                    if(row_c[i]==1 && col_c[j]==1)count++;
                }
            }
        }return count;
    }
}