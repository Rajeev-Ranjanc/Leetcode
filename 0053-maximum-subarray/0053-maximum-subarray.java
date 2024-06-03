class Solution {
    public  int maxSubArray(int[] nums) {
/*
       Extreme brute is of TC O(n^3) better will be O(n^2) and optimal will be O(n) using
       Kadane's algorithm. As mentioned in the question that there will be at least one element.
       so, we will declare 2 variables one is sum, sum will initialize by 0 and another is MAX
       which will initialize by the very first element of the array. And Now will start traversing
       in the array, and will add every element into sum and will make 2 checks inside the loop,
       first if sum will be negative I will make it 0 and another is if max will less than the
       sum then I will make max = sum and after traversal of entire array I will return max variable.

 */
        int sum = 0;
        int max = nums[0];
        for (int i : nums) {

            sum += i;
            if (max < sum) {
                max = sum;

            }

            if (sum < 0) {
                sum = 0;
            }
        }
        return max;
    }
}
