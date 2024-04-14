class Solution {
    public double angleClock(int hour, int minutes) {
      double ans = Math.abs((30 * hour) - (5.5 * minutes));

        double ans2 = Math.min(ans, 360 - ans);


        return ans2;
    }
} 