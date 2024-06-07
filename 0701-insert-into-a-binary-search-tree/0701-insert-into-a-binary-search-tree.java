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
 
/*
        In this question I'm inserting the nodes at the leaf node always to reach the leaf node
        I have created a copy of root node(temp) and checked if temp.val is less than val if yes
        then again check if their right is not null then made temp = temp.right else it's next is 
        null then I can insert myNode here then inserted temp.right = newNode and break the loop
        else(outer if) means temp.val is not less than the given val then inside that again made a 
        check is their left is null if not then simply temp = temp.left else it means their left is
        null it means I'm at leaf node and I can insert my node so inserted and break loop and return
        the root
        
*/
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