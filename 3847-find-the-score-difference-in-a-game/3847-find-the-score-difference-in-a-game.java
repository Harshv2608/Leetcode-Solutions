class Solution {
    public int scoreDifference(int[] nums) {
        int n=nums.length;
        int f=0;
        int s=0;
        int first=1;
        for(int i=0;i<n;i++){
            if(nums[i]%2!=0){
                first=1-first;
            }
            if(i%6==5){
                first=1-first;
            }
            if(first==1){
                f+=nums[i];
            }else{
                s+=nums[i];
            }
        }
        return f-s;
    }
}