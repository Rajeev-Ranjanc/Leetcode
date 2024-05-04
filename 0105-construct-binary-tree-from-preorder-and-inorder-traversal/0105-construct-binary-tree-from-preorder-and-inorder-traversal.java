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
    
     public int findPosition(int[] inorder, int ele, int n) {
        for (int i = 0; i < n; i++) {
            if (inorder[i] == ele) {
                return i;
            }
        }
        return -1;
    }
    
    public TreeNode solve(int[] inorder, int[] preorder, int[] index, int inOrderStart, int inOrderEnd, int n) {
        if (index[0] >= n || inOrderStart > inOrderEnd) {
            return null;
        }
        int ele = preorder[index[0]];
        TreeNode root = new TreeNode(ele);
        int position = findPosition(inorder, ele, n);
        index[0]++;

        root.left = solve(inorder, preorder, index, inOrderStart, position - 1, n);
        root.right = solve(inorder, preorder, index, position + 1, inOrderEnd, n);

        return root;
    }
    
    

    public TreeNode buildTree(int[] preorder, int[] inorder) {
        int n = inorder.length;
         int[] preOrderIndex = {0};
        return solve(inorder, preorder, preOrderIndex, 0, n - 1, n);
    }
}