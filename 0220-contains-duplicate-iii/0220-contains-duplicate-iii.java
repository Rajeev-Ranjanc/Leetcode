class Solution {
    public boolean containsNearbyAlmostDuplicate(int[] nums, int indexDiff, int valueDiff) {
       TreeSet<Integer> set = new TreeSet<>();

        for (int i = 0; i < nums.length; i++) {
            // Find the smallest element in the set that is greater than or equal to nums[i]
            Integer ceiling = set.ceiling(nums[i]);
            if (ceiling != null && ceiling <= nums[i] + valueDiff) {
                return true;
            }

            // Find the largest element in the set that is smaller than or equal to nums[i]
            Integer floor = set.floor(nums[i]);
            if (floor != null && nums[i] <= floor + valueDiff) {
                return true;
            }

            set.add(nums[i]);

            // Remove the element at index i - indexDiff from the set
            if (i >= indexDiff) {
                set.remove(nums[i - indexDiff]);
            }
        }

        return false;
    }
}