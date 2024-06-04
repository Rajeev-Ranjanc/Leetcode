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
        /*
    https://leetcode.com/problems/diameter-of-binary-tree/
    Diameter is the longest path between any two nodes of the tree,
    that node may pass from root of the node or not may be the longest
    path between teo nodes present in the left subtree or right subtree.
    So we need to find the longest path including root node ans in the
    left subtree as well as right subtree.

    using root node I can simply find the longest path height(level) of
    left subtree + levels of right subtree

    in the left subtree I just need to find left diameter and same for 
    right subtree and finally need to return max of these 3

 */
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