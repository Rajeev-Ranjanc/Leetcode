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
    public void flatten(TreeNode root) {
/*
Again nothing fancy but logical this is brute not optimal one. In optimal
 one time and space complexity will be same because optimal one is of recursive
 solution that will take O(n) for recursive stack & in this I'm taking a Stack whose
 max height would be the near about to O(H)
                                            In this I'm taking a stack and if root is not
null I have pushed into stack and ran while loop till stack is not empty and popped the element
from stack and check if their right exist then push into stack and then root.left, and now I make
a change the var in which I had popped first(root) element from stack their right = stack.peek()
iff stack is not empty and left is null. That's it!!

*/
        
        if (root == null) {
            return;
        }

        Stack<TreeNode> stack = new Stack<>();

        stack.push(root);

        while (!stack.isEmpty()) {

            TreeNode temp = stack.pop();

            if (temp.right != null) {
                stack.push(temp.right);
            }

            if (temp.left != null) {
                stack.push(temp.left);
            }

            if (!stack.isEmpty()) {
                temp.right = stack.peek();
            }
            
            temp.left = null;

        }

    }
}