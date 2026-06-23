class Solution {
    public int maxDistance(String moves) {
        int a=0;
        int b=0;
        int count=0;
        for(char c:moves.toCharArray()){
            if(c=='U')a++;
            else if(c=='L')b++;
            else if(c=='R')b--;
            else if(c=='_')count++;
            else a--;
        }
        return Math.abs(a)+Math.abs(b)+count;
    }
}