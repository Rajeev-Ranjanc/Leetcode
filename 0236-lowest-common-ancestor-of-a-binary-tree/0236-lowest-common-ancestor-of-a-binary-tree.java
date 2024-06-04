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
            // Searching a node into left subtree first then right subtree
/*
        very very very important question

First of all check the is root equal to p or q if yes then return root.
Now check that p & q lies in which part of the subtree either left or
right if p lies in left subtree and q lie in right subtree(not in left)
or vice versa then root is the answer and return root. Second case may
be p & q lies in the left subtree then call ancestors method recursively
to by providing root.left as root , p and q else both will lie in the right
subtree then call root.right. Don't forget to mention if p or q will equal to
root then return root and on every call exist method will call for checking which 
side the p and q is present.


 */
        if( p == root || q == root){
            return root;
        }
        
        boolean pliesLST = exist(root.left, p);
        boolean qLiesInLst = exist(root.left, q);

        if (pliesLST && qLiesInLst) {
            return lowestCommonAncestor(root.left, p, q);
        } else if (!pliesLST && !qLiesInLst) {
            return lowestCommonAncestor(root.right, p, q);
        }
        
//      I can comment this too because either p lie in left and q lie in right
//        or q lie in the left and p lie in the right in the both case I can return the
//        root of the node

//        else if (pliesLST == true && qLiesInLst == false) {
//            return root;
//        }
//        One more case will be p will not lie in the LST and q will lie
//        into RST then we can return the root
        
        return root;

        
    }
    
    public boolean exist(TreeNode root, TreeNode node) {
        
        
        
        if (root == node) {
            return true;
        }
        
        if (root == null && node != null) {
            return false;
        }

        return exist(root.left, node) || exist(root.right, node);

    }
}