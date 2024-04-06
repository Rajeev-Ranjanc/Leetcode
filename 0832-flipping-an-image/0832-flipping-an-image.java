class Solution {
    public int[][] flipAndInvertImage(int[][] image) {
         for (int[] row : image) {
            //reverse the image array
            for (int i = 0; i < (image[0].length + 1) / 2; i++) {
                //swap with the first and last elements
                int temp = row[i] ^ 1;
                row[i] = row[image[0].length - 1 - i] ^ 1;
                row[image[0].length - 1 - i] = temp;
            }
        }
        return image;
    }
}