class Solution {
    public int arithmeticTriplets(int[] nums, int diff) {
        int n=nums.length;
        int cnt=0;
        for(int j=1;j<n-1;j++){
            int i=0;
            int k=n-1;
            while(i<j && j<k){
                if(nums[j]-nums[i]==diff && nums[k]-nums[j]==diff){
                    cnt++;
                    break;
                }
                if(nums[j]-nums[i]>diff)i++;
                else if(nums[j]-nums[i]<diff)break;
                if(nums[k]-nums[j]>diff)k--;
                else if(nums[k]-nums[j]<diff)break;
            }
        }return cnt;
    }
}