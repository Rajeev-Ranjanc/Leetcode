/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */

class Solution {
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        
        if (p == root || q == root) {
            return root;
        }
        if (p.val < root.val && q.val < root.val) {
//            it means p and q lies in the left of the root
            return lowestCommonAncestor(root.left, p, q);
        } else if (p.val > root.val && q.val > root.val) {
//            it means p and q both lies int the right part of the bst
            return lowestCommonAncestor(root.right, p, q);
        }

        return root;

        
    }
}