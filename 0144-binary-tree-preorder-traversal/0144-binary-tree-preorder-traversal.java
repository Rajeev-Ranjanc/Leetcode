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
   
    
    public List<Integer> preorderTraversal(TreeNode root) {
        /*
        This is the first way to do so in which we declare list inside the function we can do same after 
        declaring the list outside the function and keep adding elements into the list and finally return 
        the list
        */
        List<Integer> list = new ArrayList<>();
        if(root == null){
           
           return list;
           
       }
        list.add(root.val);
        list.addAll(preorderTraversal(root.left));
        list.addAll(preorderTraversal(root.right));
        return list;
    }
    
}