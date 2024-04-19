class Solution {
    public int[][] generateMatrix(int n) {
//         int minr = 0;
//         int minc = 0;
//         int maxr = n - 1;
//         int maxc = n - 1;
//         int val = 1;
//         int[][] matrix = new int[n][n];

//         while (minr <= maxr) {

//             for (int i = minc; i <= maxc; i++) {
//                 matrix[minr][i] = val++;
//             }
//             minr++;


//             if (minr > maxr || minc > maxc) break; // to avoid adding the last only elements by two times

//             for (int i = minr; i <= maxr; i++) {
//                 matrix[i][maxc] = val++;
//             }
//             maxc--;


//             if (minr > maxr || minc > maxc) break;
//             for (int i = maxc; i >= minc; i--) {
//                 matrix[maxr][i] = val++;
//             }
//             maxr--;

//         }
//         return matrix;
        
        
        // check this code although generative
        /*
            This modification ensures that the loop terminates when all cells in the matrix are filled, even for odd-sized matrices. Also, it adds a check in each loop iteration to ensure val does not exceed n * n, which could happen if the matrix size is odd.
            
            In this context, n * n represents the total number of cells in an n x n matrix. Since you are filling the matrix in a spiral order starting from the top-left corner and moving clockwise, you need to ensure that you stop filling the matrix once you have populated all n * n cells. If you don't check this condition, you might end up trying to access cells outside the bounds of the matrix, which would result in an ArrayIndexOutOfBoundsException.
            
        */
        int minr = 0;
        int minc = 0;
        int maxr = n - 1;
        int maxc = n - 1;
        int val = 1;
        int[][] matrix = new int[n][n];

        while (val <= n * n) {
            for (int i = minc; i <= maxc && val <= n * n; i++) {
                matrix[minr][i] = val++;
            }
            minr++;

            for (int i = minr; i <= maxr && val <= n * n; i++) {
                matrix[i][maxc] = val++;
            }
            maxc--;

            for (int i = maxc; i >= minc && val <= n * n; i--) {
                matrix[maxr][i] = val++;
            }
            maxr--;

            for (int i = maxr; i >= minr && val <= n * n; i--) {
                matrix[i][minc] = val++;
            }
            minc++;
        }

        return matrix;
    }
}