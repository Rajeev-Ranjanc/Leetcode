class Solution {
    public int hammingWeight(int n) {
        
        /*
        in this i have to just check the bit of the number every time and I''m doing right shift so n become
        n/2 and keep doing till n is greater than zero and if last bit is 1 and then we increase the counter
        variable by 1
        */
        int count = 0;
        while (n > 0) {
            if ((n & 1) == 1) {
                count++;
            }
            n = n >> 1;
        }

        return count;
    }
}