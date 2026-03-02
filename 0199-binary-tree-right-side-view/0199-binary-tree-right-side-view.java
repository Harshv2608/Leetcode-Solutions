/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    
    public List<Integer> rightSideView(TreeNode root) {
         List<Integer> ans=new ArrayList<>();
        if(root==null)return ans;
        rightSideHelper(root,ans,0);
        return ans;
    
    }
    void rightSideHelper(TreeNode root, List<Integer> res,int depth){
        if(root==null)return;
        if(depth==res.size())res.add(root.val);
        rightSideHelper(root.right,res,depth+1);
        rightSideHelper(root.left,res,depth+1);
    }
}