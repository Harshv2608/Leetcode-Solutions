class Solution {
    public int minBishopMoves(int[] source, int[] target) {
        int sr=source[0];
        int sc=source[1];
        int tr=target[0];
        int tc=target[1];
        if((sr+sc)%2 != (tr+tc)%2)return -1;
        if((sr+sc==tr+tc)  ||  (sc-sr==tc-tr))return 1;
        return 2;
    }
}