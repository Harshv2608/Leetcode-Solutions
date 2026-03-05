class Solution {
    public void markallzeroes(char[][] grid,int i,int j){
        if(i < 0 || j < 0 || i >= grid.length || j >= grid[0].length || grid[i][j] == '0')
            return;
        grid[i][j]='0';
        markallzeroes(grid,i-1,j);
        markallzeroes(grid,i+1,j);
        markallzeroes(grid,i,j-1);
        markallzeroes(grid,i,j+1);
    }
    public int numIslands(char[][] grid) {
        int count=0;
        int m=grid.length;
        int n=grid[0].length;
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                char c=grid[i][j];
                if(c=='1'){
                    markallzeroes(grid,i,j);
                    count++;
                }
            }
        }return count;
    }
}