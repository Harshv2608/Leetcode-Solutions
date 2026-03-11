class Solution {
    public int bitwiseComplement(int n) {
        if(n==0)return 1;
        int high=Integer.highestOneBit(n);
        int mask=(high << 1)-1;
        return mask-n;
    }
}