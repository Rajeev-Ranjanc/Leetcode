class Solution {
    public int[][] largestLocal(int[][] grid) {
        
        /*
    https://leetcode.com/problems/largest-local-values-in-a-matrix/
//  to solve this I have runs two loop one inside another one In upto n-2 times and find the largest elements 
    into the grid by within i to i+3 sub grid and put that element into the maxLocale matrix and simply returned them
 */
        int n = grid.length;
        
        int[][] maxLocal = new int[n - 2][n - 2];
        
        for (int i = 0; i < n - 2; i++) {
            
            for (int j = 0; j < n - 2; j++) {
                
                maxLocal[i][j] = findMaxLocal(grid, i, j);
                
            }
            
        }
        return maxLocal;
        
    }

    public static int findMaxLocal(int[][] grid, int i, int j) {
        
        int ans = Integer.MIN_VALUE;
        for (int k = i; k < i + 3; k++) {
            
            for (int l = j; l < j + 3; l++) {
                
                if (ans < grid[k][l]) {
                    
                    ans = grid[k][l];
                }
            }
        }
        return ans;
        
    }
}