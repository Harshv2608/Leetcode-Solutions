class Solution {
    public int largestOverlap(int[][] img1, int[][] img2) {
        int n=img1.length;
        int ans=0;
        for(int down=-(n-1);down<=(n-1);down++){
            for(int right=-(n-1);right<=(n-1);right++){
                int cnt=0;
                for(int row=0;row<n;row++){
                    for(int col=0;col<n;col++){
                        if(img1[row][col]==1){
                            int nrow=row+down;
                            int ncol=col+right;
                            if(nrow>=0 && nrow<n && ncol>=0 && ncol<n && img2[nrow][ncol]==1){
                                cnt++;
                            }
                        }
                    }
                }
                ans=Math.max(ans,cnt);
            }
        }
        return ans;
    }
}