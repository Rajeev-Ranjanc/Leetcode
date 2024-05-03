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
    public int minDepth(TreeNode root) {
        /*
       
        Preety simple forward we just called a recursion for the left subtree which will return the
        height of the left sub-tree and another recusrsion will return height of right subtree then we 
        will simply return the minimum from both of them + 1 if and only if left and right both will not be 
        equal to 0(Zero) and for every left node that recursion call will go left and right and will find null              so that leaf node will find min(0 , 0 ) + 1 to their
        parent node and that node will also do same for their recursive call and 
        if the any subtree will be equal to zero then we will return the maximum depth because if left node
        will be null then that is not any subtree so we can't say that will be depth of that tree because
        there is no node
            

        */
        int count = 0;
        if(root == null){
            return 0;
        }
        
        int left = minDepth(root.left);
        int right = minDepth(root.right);
        
        if(left>0 && right >0){
            return Math.min(left , right) + 1;
        }
        
        return Math.max(left , right)+1;
    }
}