class Solution {
    public int[] scoreValidator(String[] events) {
        int score=0;
        int cnt=0;
        for(String str:events){
            if(cnt==10)return new int[]{score,cnt};
            if(str.equals("W"))cnt++;
            else if(str.equals("WD") || str.equals("NB"))score++;
            else{
                score+=Integer.parseInt(str);
            }
        }
        return new int[]{score,cnt};
    }
}