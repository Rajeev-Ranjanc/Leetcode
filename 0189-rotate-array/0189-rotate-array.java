class Solution {
    public void rotate(int[] nums, int k) {
        
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