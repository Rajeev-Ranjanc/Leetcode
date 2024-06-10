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
    public boolean findTarget(TreeNode root, int k) {
        
        ArrayList<Integer> al = new ArrayList<>();
        
        helper(root, al);
        
        int i =0 ;
        
        int j = al.size()-1;
        
        int sum = 0;
        
        while(i<j){
            
            sum = al.get(i) + al.get(j);
            
            if(sum == k){
                
                return true;
                
            }
            
            else if(sum > k){
                
                j--;
            }
            
            else{
                
                i++;
            }
            
        }
        return false;
        
    }
    private void helper(TreeNode root, ArrayList<Integer> al) {
        
        if (root == null) {
            return;
        }
        
        helper(root.left, al);
        al.add(root.val);
        helper(root.right, al);
        
    }
}