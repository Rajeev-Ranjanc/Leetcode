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
    public boolean isSameTree(TreeNode p, TreeNode q) {
/*
        Pretty simple and clear just checked base condition if the root node or any other node of both
        tree is null then return false and if any one of node is null is others is not null then return 
        false and after that we call a recursive call for the left subtree and again we call other recursive             call for the right subtree and after that we compare the data of both root and stored into a variable
        of boolean type and finally checked if all these three boolean variables are true or not if not then 
        return false otherwise return 
        true
*/
         if (p == null && q == null) {
            return true;
        }

        if (p == null && q != null) {
            return false;
        }

        if (p != null && q == null) {
            return false;
        }
        boolean left = isSameTree(p.left, q.left);
        boolean right = isSameTree(p.right, q.right);

        boolean data = p.val == q.val;
        if (left && right && data) {
            return true;
        }
        return false;
    }
}