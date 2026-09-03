class Solution {
    public boolean uniformArray(int[] nums1) {
        int mino=Integer.MAX_VALUE;
        int mine=Integer.MAX_VALUE;
        for(int n:nums1){
            if(n%2==0){
                mine=Math.min(n,mine);
            }else{
                mino=Math.min(n,mino);
            }
        }
        if(mino==Integer.MAX_VALUE || mine==Integer.MAX_VALUE)return true;
        return mine-mino>0;
    }
}