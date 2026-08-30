class Solution {
    public int countSpecialIntegers(int[] nums) {
        int cnt=0;
        int n=nums.length;
        Map<Integer,Integer> start=new HashMap<>();
        Map<Integer,Integer> end=new HashMap<>();
        for(int i=0;i<n;i++){
            if(!start.containsKey(nums[i])){
                start.put(nums[i],i);
            }
        }
        for(int i=n-1;i>=0;i--){
            if(!end.containsKey(nums[i])){
                end.put(nums[i],i);
            }
        }
        for(int val : start.keySet()){
            int s=start.get(val);
            int e=end.get(val);
            boolean check=true;
            for(int i=s;i<=e;i++){
                if(nums[i]!=val){
                    check=false;
                    break;
                }
            }
            if(check)cnt++;
        }
        return cnt;
    }
}