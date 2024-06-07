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
    public boolean isValidBST(TreeNode root) {
/*
        https://leetcode.com/problems/validate-binary-search-tree/
        Pretty Interesting question I can do it by providing a range to our helper function.
        First I provide the root and Long MIN value for min range LONG max for max range and
        in helper function I have returned true if root is null and check if root.val is less than 
        then min val or root.val is greater than the max val then return false and for the left
        recursive call min will be min but max will be root.val and for right recursive call min will be 
        root.val and max will be long max that's it
*/
        return helper(root, Long.MIN_VALUE, Long.MAX_VALUE);
        
    }
     private boolean helper(TreeNode root, long minVal, long maxVal) {
         
        if (root == null) {
            return true;
        }
         
        if (root.val >= maxVal || root.val <= minVal) {
            return false;
        }
        return helper(root.left, minVal, root.val) && helper(root.right, root.val, maxVal);
    }
}