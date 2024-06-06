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
    private List<Integer> deepCopy(List<Integer> arr) {
        // Create a new list to store the copied elements
        List<Integer> a = new ArrayList<>();
        // Iterate through the original list and add each element to the new list
        for (int ele : arr) {
            a.add(ele);
        }
        // Return the new list which is a deep copy of the original list
        return a;
    }

    public List<List<Integer>> pathSum(TreeNode root, int targetSum) {
        
        // Initialize the list to store all valid paths
        List<List<Integer>> ans = new ArrayList<>();
        
        // Initialize the list to store the current path
        List<Integer> list = new ArrayList<>();
        
        // Start the recursive helper function
        helper(root, targetSum, ans, list);
        
        // Return the list of all valid paths
        return ans;
    }


    private void helper(TreeNode root, int targetSum, List<List<Integer>> ans, List<Integer> list) {
        // If the current node is null, return immediately (base case for recursion)
        if (root == null) {
            return;
        }

        // If the current node is a leaf node (no left or right child)
        if (root.left == null && root.right == null) {
            // Check if the current node's value equals the remaining targetSum
            if (root.val == targetSum) {
                // Add the current node's value to the current path list
                list.add(root.val);
                // Add the current path list to the list of valid paths
                ans.add(list);
            }
            // Return since we've processed a leaf node
            return;
        }

        // Add the current node's value to the current path list
        list.add(root.val);

        // Make deep copies of the current path list
        // This is done to ensure each recursive call works with its own path list
        List<Integer> arr1 = deepCopy(list);
        List<Integer> arr2 = deepCopy(list);

        // Recursively call helper for the left subtree with updated targetSum and new path list
        helper(root.left, targetSum - root.val, ans, arr1);

        // Recursively call helper for the right subtree with updated targetSum and new path list
        helper(root.right, targetSum - root.val, ans, arr2);
    }
}