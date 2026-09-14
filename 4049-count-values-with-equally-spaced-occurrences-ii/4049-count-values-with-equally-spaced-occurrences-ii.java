class Solution {
    public int countSpecialIntegers(int[] nums) {
        Map<Integer,List<Integer>> map=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            if(!map.containsKey(nums[i])){
                map.put(nums[i],new ArrayList<>());
            }
            map.get(nums[i]).add(i);
        }
        int cnt=0;
        for(int x:map.keySet()){
            if(map.get(x).size()>=3){
                int dist=map.get(x).get(1)-map.get(x).get(0);
                boolean flag=true;
                for(int i=2;i<map.get(x).size();i++){
                    if(map.get(x).get(i)-map.get(x).get(i-1)!=dist){
                        flag=false;
                        break;
                    }
                }
                if(flag)cnt++;
            }
        }
        return cnt;
    }
}