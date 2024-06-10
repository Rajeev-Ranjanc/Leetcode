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
    public TreeNode deleteNode(TreeNode root, int key) {
/*      https://leetcode.com/problems/delete-node-in-a-bst/

Deletion is easy but writing its code is little difficult so visit the occasionally to see the code
and check code. although check if root is null if so return null if I need to delete the root node
then I need to find the biggest no of left subtree and need to put root.right into their right part so this  is doing by a function named helper here! and if I need to delete just left node of the root then I have passed
root.left into helper function and that helper is returning whatever I just put that node into root.left else just root = root.left in the else part of(I need to delete just left node of the root) it means I need to delete the just right part of the root then passed the root.right into helper method and whatever we get in return put into the root.right  of the root else simply root = root.right else simply return dummy(copy of root) in which I have stored before moving the root
 */
        if (root == null) {
            
            return null;

        }

        if (root.val == key) {
            return helper(root);
        }

        TreeNode dummy = root;

        while (root != null) {

            if (root.val > key) {

                if (root.left != null && root.left.val == key) {

                    root.left = helper(root.left);
                    
                } else {

                    root = root.left;

                }

            } else {

                if (root.right != null && root.right.val == key) {

                    root.right = helper(root.right);

                } else {

                    root = root.right;

                }
            }
        }

        return dummy;

        
    }
    
    
    private TreeNode helper(TreeNode root) {

        if (root.left == null) {

            return root.right;

        } else if (root.right == null) {

            return root.left;

        } else {

            TreeNode rightChild = root.right;
         
//          finding last right (make biigest no of left-substree)
            TreeNode lastRight = findLastRight(root.left);

           
            lastRight.right = rightChild;
        

            return root.left;

        }
    }
    
    private TreeNode findLastRight(TreeNode root) {
        
        if (root.right == null) {
            
            return root;
            
        }
        
        return findLastRight(root.right);
        
    }
}