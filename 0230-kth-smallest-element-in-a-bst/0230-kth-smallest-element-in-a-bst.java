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
    public int kthSmallest(TreeNode root, int k) {
         /*
            Extreme brute force I can think about I can traverse the entire tree byy Inorder 
            Traversal and store all the node val into an arrayList I will get all the elements
            into sorted order and after traversal I can simply return the k-1 th element from
            arraylist
         */
        ArrayList<Integer> a = new ArrayList<>();
        
        helper(root, a);
        
        return a.get(k - 1);
    }
    private void helper(TreeNode root, ArrayList<Integer> a) {
        
        if (root == null) {
            return;
        }
        
        helper(root.left, a);
        
        a.add(root.val);
        
        helper(root.right, a);
        
    }
}