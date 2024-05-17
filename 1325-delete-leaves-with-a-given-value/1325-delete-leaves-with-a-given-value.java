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
    public TreeNode removeLeafNodes(TreeNode root, int target) {
        /*
                Pretty simple and obvious we going to the root node first by recursin and once we get there
                we check is its left , right and val is equal to taget if yes then simply return null
        */
        //base case
        
        if(root == null){
            
            return null;
            
        }
        
        root.left = removeLeafNodes(root.left , target);
        
        root.right = removeLeafNodes(root.right , target);
        
        // this is the base condition where we are deleting the leaf node
        if(root.left == null && root.right == null && root.val == target){
            
            return null;
            
        }
        
        return root;
        
    }
}