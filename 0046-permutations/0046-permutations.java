class Solution {
    public static void swap(int[] nums,int a,int b){
        int temp=nums[a];
        nums[a]=nums[b];
        nums[b]=temp;
    }
    public static void permutation(int[] nums, int l, List<List<Integer>> res){
        if(l==nums.length){
            List<Integer> temp=new ArrayList<>();
            for(int num : nums){
                temp.add(num);
            }res.add(temp);
            return;
        }
        for(int i=l;i<nums.length;i++){
            swap(nums,l,i);
            permutation(nums,l+1,res);
            swap(nums,l,i);
        }
    }
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> res=new ArrayList<>();
        permutation(nums,0,res);
        return res;
    }
}