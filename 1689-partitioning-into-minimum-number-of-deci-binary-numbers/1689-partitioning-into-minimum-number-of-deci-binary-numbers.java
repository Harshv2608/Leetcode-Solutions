class Solution {
    public int minPartitions(String n) {
        int max=0;
        for(int i=0;i<n.length();i++){
            int d=n.charAt(i)-'0';
            max=Math.max(max,d);
        }
        return max;
    }
}