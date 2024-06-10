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
    
    private int i = 0;
     /*
         https://leetcode.com/problems/construct-binary-search-tree-from-preorder-traversal/

         Brute force is extreme naive that is of O(n^2) and better is by using preorder and
         inorder I will sort that array and that will be Inorder(as inorder of bst is sorted)
         Now we can form tree using preOrder & Inorder TC : O(nlog(n)) + O(n) Sc : O(n)

         Optimal is this given see code to get understand well.

         In this I took a global variable I can pass this var by reference as well and made a
         helper function in them, I have two things one is array and other thing is Integer MaxVal
         in helper function check if I become equal to array.length return null and also if arr[i] > max
         then also return null and made a root by first element of the root and called a recursive call by root.left
         = preorder and root.val for left call and for right call root.right = preorder, max. Finally, returned the root
         of the tree

     */
    public TreeNode bstFromPreorder(int[] preorder) {
        
        return helper(preorder, Integer.MAX_VALUE);
        
    }
    
    private TreeNode helper(int[] preorder, int max) {

        if (i == preorder.length || preorder[i] > max) {
            return null;
        }

        TreeNode root = new TreeNode(preorder[i++]);

        root.left = helper(preorder, root.val);
        
        root.right = helper(preorder, max);

        return root;
    }
    
}