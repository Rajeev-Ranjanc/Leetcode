class Solution {
    public int[][] sortTheStudents(int[][] score, int k) {
        /*
            we just need to need to wtrite the code of comparator using comparator this can
            be done easily
        */
         Arrays.sort(score, (int[] a, int[] b) -> Integer.compare(b[k], a[k]));
        return score;
    }
}