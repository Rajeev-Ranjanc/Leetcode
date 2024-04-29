class Solution {
    public int minOperations(int[] nums, int k) {
/*

[9,7,9,14,8,6]
12

for this problem first we calculate the Xor of all elements of an array in variable ans, and again we
did XOR operation and store in the ans variable by this there is difference of total bit which are
unequal to the Kth elements and that no of 1 will present in their binary that no of operation we will
have to perform to achieve that number, so later we will run a loop while ans>0 and will count total number
of 1 bit present in the ans var. that will be answered to return or no of operation will have to perform


 ans var for first test case -> 100 and k -> 001 and xor of these -> 101
//        here total difference is the
 */
        
         int ans;
        int a = 0;
        for (int num : nums) {
            a ^= num;
        }
        int c = 0;
//        ans for first test case -> 100 and k -> 001 and xor of these -> 101
//        here total difference is the
        ans = a ^ k; //it will contain total difference
        while (ans > 0) {
            if ((ans & 1) == 1) {
                c++;
            }
            ans = ans >> 1;
        }
        return c;
    }
}