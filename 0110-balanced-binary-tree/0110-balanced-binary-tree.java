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
    public boolean isBalanced(TreeNode root) {
        /*
        In this I'm just checking at evry step that is my node is balace and that node is saying let me ask my 
        child node and if the node become null we returned true if and did same for the right binary tree
        and if the left and right both are true and we find the difference of height of the binary left and
        right binary tree is less than equal to 1 then returned true otherwise false
        */
        if(root == null){
            return true;
        }
        
        boolean lef = isBalanced(root.left);
        
        boolean rig = isBalanced(root.right);
        
        boolean diff = Math.abs (height(root.left) - height(root.right)) <= 1;
        
        if(lef && rig && diff){
            return true;
        }
        
        return false;
            
    }
    
    //finding height of the binary tree
    public int height(TreeNode root){
        
        // int count = 0;
        //base case
        if(root == null){
            return 0;
        }
        
        int left = height(root.left);
        int right = height(root.right);
        return Math.max(left , right) +1 ;
    }
}