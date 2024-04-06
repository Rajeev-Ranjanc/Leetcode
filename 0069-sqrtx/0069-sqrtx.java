class Solution {
    public int mySqrt(int x) {
        // return (int)Math.sqrt(x);
       int start = 0;
        int end = x;
        while (start <= end) {
            long mid = start + (end - start) / 2;
            long sq = mid * mid;

            if (sq == x) {
                return (int) mid;
            } else if (sq > x) {
                end = (int) (mid - 1);
            } else {
                start = (int) (mid + 1);
            }
        }
        return end;
    }
}