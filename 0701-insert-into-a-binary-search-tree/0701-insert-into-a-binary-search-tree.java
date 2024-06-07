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
    public TreeNode insertIntoBST(TreeNode root, int val) {
        TreeNode newNode = new TreeNode(val);
        if (root == null) {
            root = newNode;
            return root;
        }
        TreeNode temp = root;
        while (true) {
            
            if (temp.val < val) {
                if (temp.right != null) {
                    temp = temp.right;
                } else {
//                    it means the right part is null so insert here
                    temp.right = newNode;
                    break;
                }
            } else {
                if (temp.left != null) {
                    temp = temp.left;
                } else {
//                    it means left part of the tree is null so insert the given node here
                    temp.left = newNode;
                    break;
                }
            }
        }
        return root;
    }
}