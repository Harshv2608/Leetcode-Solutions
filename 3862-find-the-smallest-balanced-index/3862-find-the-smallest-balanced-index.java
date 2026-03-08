class Solution {
    public int smallestBalancedIndex(int[] nums) {
        int n=nums.length;
        long [] sum=new long [n];
        long [] prod=new long [n];
        long total=nums[0];
        sum[0]=0;
        prod[n-1]=1;
        for(int i=1;i<n;i++){
            sum[i]=sum[i-1]+nums[i-1];
            total+=nums[i];
        }
        for(int i=n-2;i>=0;i--){
            if(prod[i+1]>total){
                prod[i]=total+1;
            }else{
                long next=nums[i+1];
                if(next>1 && prod[i+1]>(double)total/next){
                    prod[i]=total+1;
                }else{
                    prod[i]=prod[i+1]*next;
                    if(prod[i]>total)prod[i]=total+1;
                }
            }    
            
        }
        for(int i=0;i<n;i++){
            if(sum[i]==prod[i]){
                return i;
            }
        }
        return -1;
    }
}