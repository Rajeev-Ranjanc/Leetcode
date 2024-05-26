class Solution {
    public double angleClock(int hour, int minutes) {
        /*
            beats 100% 
        */
        
      double ans = Math.abs((30 * hour) - ((double)11/2 * minutes));

        double ans2 = Math.min(ans, 360 - ans);


        return ans2;
    }
} 