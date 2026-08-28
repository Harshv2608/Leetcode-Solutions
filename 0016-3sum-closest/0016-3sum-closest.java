class Solution {
    public int threeSumClosest(int[] nums, int target) {
        int n=nums.length;
        Arrays.sort(nums);
        int min=Integer.MAX_VALUE;
        int ans=Integer.MAX_VALUE;
        for(int i=0;i<n-2;i++){
            int j=i+1;
            int k=n-1;
            while(j<k){
                int sum=nums[i]+nums[j]+nums[k];
                if(sum<target){
                    j++;
                }else if(sum>target){
                    k--;
                }else return target;

                if(Math.abs(target-sum)<min){
                    min=Math.abs(target-sum);
                    ans=sum;
                }
            }
        }
        return ans;
    }
}