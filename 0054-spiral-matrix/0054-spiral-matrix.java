class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        
        
        ArrayList<Integer> ans = new ArrayList<>();
        int minr = 0;
        int minc = 0;
        int maxr = matrix.length - 1;
        int maxc = matrix[0].length - 1;

        //or we can do minc <= maxc it will also work

        while (minr <= maxr) {

            //first condition
            //here constant will maxr -> this will add all elements of first row at first call
            for (int i = minc; i <= maxc; i++) {
                ans.add(matrix[minr][i]);
            }
            minr++;

            //second condition -> for the right column
            //constant will be maxc -> clear it by making diagram
            if (minr > maxr || minc > maxc) break; // to avoid adding the last only elements by two times
            for (int i = minr; i <= maxr; i++) {
                ans.add(matrix[i][maxc]);
            }
            maxc--;

            //third condition -> constant will be maximum row
            //for the bottom row from right to left all verify by diagram
            if (minr > maxr || minc > maxc) break;
            for (int i = maxc; i >= minc; i--) {
                ans.add(matrix[maxr][i]);
            }
            maxr--;

            //last condition will be for the left most column for that column will be constant
            //while loop will max row to min row from bottom to up
            
            for (int i = maxr; i >= minr; i--) {
                ans.add(matrix[i][minc]);
            }
            minc++;

        }

        return ans;
        
    }
}