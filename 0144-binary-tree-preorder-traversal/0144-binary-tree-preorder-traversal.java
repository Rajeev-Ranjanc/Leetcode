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
     List<Integer> list = new ArrayList<>();
    
    public List<Integer> preorderTraversal(TreeNode root) {
        /*
        This is the first way to do so in which we declare list inside the function we can do same after 
        declaring the list outside the function and keep adding elements into the list and finally return 
        the list
        */
      
        if(root == null){
           
           return new ArrayList<>();
           
       }
        list.add(root.val);
        preorderTraversal(root.left);
        preorderTraversal(root.right);
        return list;
    }
    
}