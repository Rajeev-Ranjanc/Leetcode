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
    public int sumOfLeftLeaves(TreeNode root) {
        return helper(root , null);
    }
    
    public int helper(TreeNode curr , TreeNode parent){
        //
        if(curr == null){
            return 0;
        }
        
        //leaf
        if(curr.left == null && curr.right == null){
            if(parent != null && parent.left == curr){
                return curr.val;
            }
        }
        
        int left = helper(curr.left , curr);
        int right = helper(curr.right , curr);
        
        return left + right;
    }
}