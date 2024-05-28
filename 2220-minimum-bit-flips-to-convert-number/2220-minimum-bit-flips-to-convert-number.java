class Solution {
    public int minBitFlips(int start, int goal) {
        
         int cnt = 0;
        while (start != goal) {
            int and = start & 1 ^ goal & 1;
            if (and == 1) {
                cnt++;
            }
            start = start >> 1;
            goal = goal >> 1;
        }
        return cnt;
        
    }
}