class Solution {
    public int matrixScore(int[][] grid) {
        //if first element of any row is not 1 then flip bcz that will be bigger element than else
        //decoded
        int m = grid.length;
        int n = grid[0].length;

        for (int i = 0; i < m; i++) {

            if (grid[i][0] == 0) {

                //flip that entire row because 0111 < 1000 so, we do flip

                for (int j = 0; j < n; j++) {

                    grid[i][j] ^= 1;

                }
            }

        }

        //now we will flip that column which has more no of 0 than one if so then we will flip.
        // flip those columns where no of zero is greater than no od 1
        for (int j = 1; j < n; j++) { // j!=0 because we already flip the entire first column
            int noOfZero = 0;
            int noOfOne = 0;
            for (int i = 0; i < m; i++) {
                if (grid[i][j] == 0) {
                    noOfZero++;
                } else {
                    noOfOne++;
                }
            }

            if (noOfZero > noOfOne) {
                for (int i = 0; i < m; i++) {
                    //flip tha column
                    grid[i][j] ^= 1;
                }
            }

        }
 /*
        Now we need to calculate the score of the matrix for that we can do a couple of things like we reverse the
        entire 2d array by row wise, and then we may go through arr[i][j]*Math.pow(2,i) like stuff
        or we can do another things that is we treat the last column as ones and multiply by 1 and second column from
        right multiply each column by 2 and third by 4 and so on and then we can store the decimal value we will do
        here second approach
*/
        int score = 0;
        int x = 1;
        for (int i = n - 1; i >= 0; i--) {
            for (int j = 0; j < m; j++) {
                score += grid[j][i] * x;
            }
            x *= 2;
        }
        return score;
    }
}