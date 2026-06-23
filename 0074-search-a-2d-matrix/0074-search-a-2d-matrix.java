class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int row=matrix.length;
        int col=matrix[0].length;
        int l=0;
        int h=row*col-1;
        while(l<=h){
            int m=l+(h-l)/2;
            int r=m/col;
            int c=m%col;
            if(target>matrix[r][c]){
                l=m+1;
            }else if(target<matrix[r][c]){
                h=m-1;
            }else{
                return true;
            }
        }return false;
    }
}