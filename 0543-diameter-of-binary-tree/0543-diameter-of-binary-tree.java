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
    public int diameterOfBinaryTree(TreeNode root) {
        
          if (root == null) {
            return 0;
        }
//        longest path passing through the root node
        int myDia = levels(root.left) + levels(root.right);

//        longest path present in the left subtree
        int leftDia = diameterOfBinaryTree(root.left);

//        longest path present into the right subtree
        int rightDia = diameterOfBinaryTree(root.right);

        return Math.max(myDia, Math.max(leftDia, rightDia));
        
    }
    
  public int levels(TreeNode root) {

        if (root == null) {
            return 0;
        }

        return Math.max(levels(root.left), levels(root.right)) + 1;
    }

}