class Solution {
    public int cherryPickup(int[][] grid) {
        int n=grid.length;
        int m=grid[0].length;
        int[][][] dp=new int[n][m][m];
        for(int col1=0;col1<m;col1++){
            for(int col2=0;col2<m;col2++){
                if(col1==col2){
                    dp[n-1][col1][col2]=grid[n-1][col1];
                }else{
                    dp[n-1][col1][col2]=grid[n-1][col1]+grid[n-1][col2];
                }
            }
        }
        for(int row=n-2;row>=0;row--){
            for(int col1=0;col1<m;col1++){
                for(int col2=0;col2<m;col2++){
                    int cherries=0;
                    if(col1==col2)cherries=grid[row][col1];
                    else cherries=grid[row][col1]+grid[row][col2];
                    int best=0;
                    for(int d1=-1;d1<=1;d1++){
                        for(int d2=-1;d2<=1;d2++){
                            int nc1=col1+d1;
                            int nc2=col2+d2;
                            if(nc1>=0 && nc1<m && nc2>=0 && nc2<m){
                                best=Math.max(best,cherries+dp[row+1][nc1][nc2]);
                            }
                            
                        }
                    }
                    dp[row][col1][col2]=best;
                }
            }
        }
        return dp[0][0][m-1];
    }
}