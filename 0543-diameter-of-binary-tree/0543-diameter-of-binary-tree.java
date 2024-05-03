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
     int height(TreeNode root) 
    {
        // code here 
        int count = 0;
        if(root == null){
            return 0;
        }
        
        int left = height(root.left);
        int right = height(root.right);
        
        count = Math.max(left , right);
        
        return count+1;
        
        
    }
    
    public int diameterOfBinaryTree(TreeNode root) {
         if(root == null){
            return 0;
        }
        int op1 = diameterOfBinaryTree(root.left);
        int op2 = diameterOfBinaryTree(root.right);
        
        //this is giving TLE because on every recursive call I'm also calling height 
        //and height is of O(n) time complexiticy, it become o(N^2) time complexicity
        //so this is not a good idea
        
        int op3 = height(root.left) + height(root.right);
        
        return Math.max(op1 ,Math.max(op2 , op3));
    }
}