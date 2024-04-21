class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        
         int m = matrix.length;
        int n = matrix[0].length;
        int i = 0;
        int j = n - 1; //both position of i and j was pointed on the last elements of the first row
//        while I, is less than is m because we are traversing either down or left so ith should not be indexed out of
//        bond on left side while j should not be the out of bound in down that's why
        while (i < m && j >= 0) {
            if (matrix[i][j] == target) {
                return true;
            } else if (matrix[i][j] > target) {//go to the left side of that row
                j--;
            } else {
                //go to the down/ next row
                i++;
            }
        }
        return false;
        
    }
}