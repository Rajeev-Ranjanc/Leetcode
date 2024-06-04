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
    public boolean isSymmetric(TreeNode root) {
        
          if (root == null) {
            return true;
        }
        
        TreeNode temp = invert(root.right);
        
        return helper(root.left, temp);
        
    }
    public boolean helper(TreeNode root, TreeNode temp) {

        if (temp != null && root == null) {
            return false;
        }
        if (root != null && temp == null) {
            return false;
        }
//        Base case
        if (root == null && temp == null) {
            return true;
        }


        boolean left = helper(root.left, temp.left);
        boolean right = helper(root.right, temp.right);
        
        boolean val = (root.val == temp.val);
        return (left && right && val);
    }

    private TreeNode invert(TreeNode root) {

       if(root == null){
            return root;
        }   
        
        TreeNode temp = root.left;
        root.left = root.right;
        root.right = temp;
        
        invert(root.left);
        invert(root.right);
        
        return root;
    }
}