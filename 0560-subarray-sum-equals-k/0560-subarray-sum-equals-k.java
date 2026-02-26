class Solution {
    public int subarraySum(int[] nums, int k) {
        int n=nums.length;
        HashMap<Integer,Integer> map=new HashMap<>();
        map.put(0,1);
        int cnt=0;
        int psum=0;
        for(int i=0;i<n;i++){
            psum+=nums[i];
            int remove=psum-k;
            if(map.containsKey(remove)){
                cnt+=map.get(remove);
            }
            map.put(psum,map.getOrDefault(psum,0)+1);
        }
        return cnt;
    }
}