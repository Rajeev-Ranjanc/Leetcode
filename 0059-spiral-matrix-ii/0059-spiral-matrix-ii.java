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