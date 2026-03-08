class Solution {
    public String findDifferentBinaryString(String[] nums) {
        int n=nums.length;
        StringBuilder sb=new StringBuilder();
        for(int i=0;i<n;i++){
            char c=nums[i].charAt(i);
            if(c=='0')sb.append('1');
            else sb.append('0');
        }
        return sb.toString();
    }
}