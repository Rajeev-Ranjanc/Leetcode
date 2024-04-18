class Solution {
    public void setZeroes(int[][] matrix) {
        //its getting error but in this im trying to store the index where ith and jth are 0 and if it is so we           store into an list that index and then we put 0 at that index by checking that is that index                    contains in the list to solve this i have simply iterate over the matrix and checked where element is zero        and if we counter any zero then we store the i and j th value in a set because when we will get .contains       then set will return the yes or no in O(1) tc and later again traverse the array and checked that if that row or column contains in set then set that element to zero thats it
        Set<Integer> zeroRows = new HashSet<>();
        Set<Integer> zeroCols = new HashSet<>();

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                if (matrix[i][j] == 0) {
                    zeroRows.add(i);
                    zeroCols.add(j);
                }
            }
        }

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                if (zeroRows.contains(i) || zeroCols.contains(j)) {
                    matrix[i][j] = 0;
                }
            }
        }
         
    }
}