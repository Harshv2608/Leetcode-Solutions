class Solution {
    public int[] rearrangeArray(int[] nums) {
        int[] freq=new int[101];
        int max=0;
        for(int i=0;i<nums.length;i++){
            freq[nums[i]]++;
            max=Math.max(max,freq[nums[i]]);
        }
        int k=0;
        int[] ans=new int[nums.length];
        for(int i=0;i<max;i++){
            for(int j=1;j<101;j++){
                if(freq[j]>0){
                    ans[k++]=j;
                    freq[j]--;
                }
            }
        }
        return ans;
    }
}