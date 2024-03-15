class Solution {
    public int[] productExceptSelf(int[] nums) {
        /*
        step 1: we declare two array left and right
        step 2: in the left array we store the product till the i th number 
        in the array from left and in the right array from the right later 
        in the ans array we simply multiply the both ith number and store it
        into ans array and we return the ans array
        */

        int n = nums.length;

        int[] ans = new int[n];
        int[] left = new int[n];
        int[] right = new int[n];
        left[0] = 1;
        right[n - 1] = 1;
        for (int i = 1; i < n; i++) {
            left[i] = left[i - 1] * nums[i - 1];
        }
        for (int i = n - 2; i >= 0; i--) {
            right[i] = right[i + 1] * nums[i + 1];
        }
        for (int i = 0; i < n; i++) {
            ans[i] = left[i] * right[i];
        }
        return ans;
    }
}