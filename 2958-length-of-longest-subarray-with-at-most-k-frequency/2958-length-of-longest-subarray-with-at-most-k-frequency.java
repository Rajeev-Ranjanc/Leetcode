class Solution {
    public int maxSubarrayLength(int[] nums, int k) {
        int i = 0;
        int j = 0;
        int result = 0;
        int n = nums.length;
        Map<Integer, Integer> map = new HashMap<>();

        while (j < n) {

            map.put(nums[j], map.getOrDefault(nums[j], 0) + 1);

            while (i < j && map.get(nums[j]) > k) {
                map.put(nums[i], map.get(nums[i]) - 1);
                i++;
            }
            result = Math.max(result, j - i + 1);
            j++;
        }
        return result;
    }
}