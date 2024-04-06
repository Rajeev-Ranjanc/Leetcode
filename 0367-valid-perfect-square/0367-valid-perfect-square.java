class Solution {
    public boolean isPerfectSquare(int num) {
         int start = 0;
        int end = num;
        while (start <= end) {
            long mid = start + (end - start) / 2;
            long sq = mid * mid;
            if (sq == num) {
                return true;
            } else if (sq > num) {
                end = (int) (mid - 1);

            } else {
                start = (int) (mid + 1);
            }

        }
        return false;
    }
}