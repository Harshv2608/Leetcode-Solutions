class Solution {
    private void backtrack(int ind, int[] nums,int target, List<List<Integer>> res,List<Integer> temp){
        if(ind==nums.length){
            if(target==0){
                res.add(new ArrayList<>(temp));
            }
            return;
        }
        if(nums[ind]<=target){
            temp.add(nums[ind]);
            backtrack(ind,nums,target-nums[ind],res,temp);
            temp.remove(temp.size()-1);
        }
        backtrack(ind+1,nums,target,res,temp);
    }
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> res=new ArrayList<>();
        List<Integer> temp=new ArrayList<>();
        backtrack(0,candidates,target,res,temp);
        return res;
    }
}