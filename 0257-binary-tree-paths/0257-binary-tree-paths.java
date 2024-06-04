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
    public List<String> binaryTreePaths(TreeNode root) {
        
         if (root == null) {
            return new ArrayList<>();
        }

        ArrayList<String> list = new ArrayList<>();

        helper(root, "", list);

        return list;
        
    }
    public void helper(TreeNode root, String str, ArrayList<String> list) {
if(root == null){
    return;
}
        if (root.left == null && root.right == null) {
            str += root.val;
            list.add(str);
            return;
        } else {
            str += root.val + "->";

            helper(root.left, str, list);
            helper(root.right, str, list);
        }

    }
}