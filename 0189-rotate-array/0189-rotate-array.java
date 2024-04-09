class Solution {
    public void rotate(int[] nums, int k) {
        int n = nums.length;
        k = k % n;
        for (int i = 0; i < n / 2; i++) {
            swap(nums, i, n - 1 - i);
        }

        for (int i = 0; i < k / 2; i++) {
            swap(nums, i, k - i - 1);
        }
        for (int i = k; i < (n + k) / 2; i++) {
            swap(nums, i, (n + k - 1 - i));
            // System.out.println();
//            System.out.println(i + " " + (n + k - 1 - i));
        }

    }

    public static void swap(int[] nums, int first, int second) {
        int temp = nums[first];
        nums[first] = nums[second];
        nums[second] = temp;
    }
}