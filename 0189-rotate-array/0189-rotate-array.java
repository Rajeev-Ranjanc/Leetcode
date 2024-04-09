class Solution {
    public void rotate(int[] nums, int k) {
        /*
    Although this is not optimized one for optimization we can do this is 100 optimized one in this
    First we reverse the array from 0 to n-1-k (first elements which does not contain kth item) then second time
    reversed the array elements from n-k(from kth) to length of the array and then again reverse the complete array
     */
        int n = nums.length;
        k = k % n;
        reverse(nums, 0, n - 1 - k);
        reverse(nums, n - k, n-1);
        reverse(nums, 0, n-1);
        
    }
    
    public void reverse(int[] nums, int start , int end) {
        while (start <= end) {
            swap(nums, start, end);
            start++;
            end--;
        }
    }
    public static void swap(int[] nums, int first, int second) {
        int temp = nums[first];
        nums[first] = nums[second];
        nums[second] = temp;
    }
}