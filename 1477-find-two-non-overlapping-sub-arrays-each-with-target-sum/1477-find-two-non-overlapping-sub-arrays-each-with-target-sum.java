class Solution {
    public int minSumOfLengths(int[] arr, int target) {
        int n=arr.length;
        int[] pre=new int[n];
        for(int i=0;i<n;i++){
            pre[i]=Integer.MAX_VALUE;
        }
        int ans=Integer.MAX_VALUE;
        int left=0;
        int sum=0;
        for(int right=0;right<n;right++){
            sum+=arr[right];
            while(sum>target){
                sum-=arr[left++];
            }
            if(sum==target){
                int curr=right-left+1;
                if(left>0 && pre[left-1]!=Integer.MAX_VALUE){
                    ans=Math.min(ans,curr+pre[left-1]);
                }
                if(right==0){
                    pre[right]=curr;
                }else{
                    pre[right]=Math.min(curr,pre[right-1]);
                }
            }else{
                if(right>0)pre[right]=pre[right-1];
            }
        }
        if(ans==Integer.MAX_VALUE){
            return -1;
        }return ans;
    }
}