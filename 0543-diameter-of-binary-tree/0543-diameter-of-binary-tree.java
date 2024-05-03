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
        This method will take only O(N) time complexity because in this first we declare a variavle of pair 
        class types in which I'm storing the length as well as the height of the binary node in the previous
        previous method we were doing in that time complexity was the o(N^2) after that to improve that 
        i'm doing by this method in this first variable which is of pair class types represents the diameter and
        second variable represents the height of the binary tree
        */
        return diameterFast(root).first;
    }
    
    public Pair diameterFast(TreeNode root) {
        // base case
        if (root == null) {
            return new Pair(0, 0);
        }

        Pair left = diameterFast(root.left);
        Pair right = diameterFast(root.right);

        int op1 = left.first;
        int op2 = right.first;
        int op3 = left.second + right.second;

        Pair ans = new Pair(Math.max(op1, Math.max(op2, op3)), Math.max(left.second, right.second) + 1);

        return ans;
    }

    class Pair {
        int first, second;

        public Pair(int first, int second) {
            this.first = first;
            this.second = second;
        }
    }
}