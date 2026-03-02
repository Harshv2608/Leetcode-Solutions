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
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> ans=new LinkedList<>();
        if(root==null)return ans;
        Queue<TreeNode> q=new LinkedList<>();
        boolean flag=true;
        q.offer(root);
        while(!q.isEmpty()){
            int size=q.size();
            LinkedList<Integer> level=new LinkedList<>();
            for(int i=0;i<size;i++){
                TreeNode node=q.poll();
                if (flag) {
                    level.addLast(node.val);
                } else {
                    level.addFirst(node.val);
                }
                if(node.left!=null){
                    q.offer(node.left);
                }if(node.right!=null){
                    q.offer(node.right);
                }
            }
            flag=!flag;
            ans.add(level);
        }
        return ans;
        
    }
}