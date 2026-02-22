class Solution {
    public static boolean checkstrong(int x,int y){
        int diff=Math.max(x,y)-Math.min(x,y);
        if(diff<=Math.min(x,y)){
            return true;
        }return false;
    }
    public int maximumStrongPairXor(int[] nums) {
        int n=nums.length;
        int max=0;
        for(int i=0;i<n-1;i++){
            for(int j=i+1;j<n;j++){
                if(checkstrong(nums[i],nums[j])){
                    int xor=nums[i]^nums[j];
                    max=Math.max(xor,max);
                }
            }
        }
        return max;
    }
}