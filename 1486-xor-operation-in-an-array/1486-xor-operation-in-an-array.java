class Solution {
    public int xorOperation(int n, int start) {
        int ans = 0;
        int i = 0;

        while (n-- > 0) {
            ans ^= start + 2 * i;
            i++;
        }
        return ans;
    }
}