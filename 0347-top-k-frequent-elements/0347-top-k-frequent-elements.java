class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        int n=nums.length;
        Map<Integer,Integer> map=new HashMap<>();
        List<Integer>[] bucket=new List[n+1];
        for(int num : nums){
            map.put(num,map.getOrDefault(num,0)+1);
        }
        for(int key : map.keySet()){
            int freq=map.get(key);
            if(bucket[freq]==null){
                bucket[freq]=new ArrayList<>();
            }
            bucket[freq].add(key);
        }
        int[] res=new int[k];
        int counter=0;
        for(int i=n;i>=0 && counter<k;i--){
            if(bucket[i]!=null){
                for(Integer num : bucket[i]){
                    res[counter++]=num;
                }
            }
        }
        return res;
    }
}