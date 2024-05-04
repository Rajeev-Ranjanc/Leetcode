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
    
    public int findPosition2(int[] in, int ele, int n) {
        for (int i = 0; i < n; i++) {
            if (in[i] == ele) {
                return i;
            }
        }
        return -1;
    }

    public TreeNode solveSecond(int[] inorder, int[] post, int[] index, int inOrderStart, int inOrderEnd, int n) {
        //base condition will change partially
        if (index[0] < 0 || inOrderStart > inOrderEnd) {
            return null;
        }
        //creation of a new node
        int ele = post[index[0]];
        TreeNode root = new TreeNode(ele);

        //find index of element in Inorder array
        int position = findPosition2(inorder , ele , n);
        index[0]--;

//        recursive calls
        root.right = solveSecond(inorder, post, index, position + 1, inOrderEnd, n);
        root.left = solveSecond(inorder, post, index, inOrderStart, position - 1, n);


        return root;
    }

 

    public TreeNode buildTree(int[] in, int[] post) {
         // Your code here
        int n = post.length;
        int[] postOrderIndex = {n - 1};
       
//
//        int postOrderIndex =

        TreeNode ans = solveSecond(in, post, postOrderIndex, 0, n - 1, n);

        return ans;

    }
}