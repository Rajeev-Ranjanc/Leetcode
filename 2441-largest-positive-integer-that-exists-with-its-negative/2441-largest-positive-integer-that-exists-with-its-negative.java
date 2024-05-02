class Solution {
    public int findMaxK(int[] nums) {
       Set<Integer> set = new TreeSet<>();
        for (int num : nums) {
            if (num < 0) {
                set.add(num);
            }
        }
        Arrays.sort(nums);
//        System.out.println(Arrays.toString(nums));
//        System.out.println(nums[nums.length-1]);
        for (int i = nums.length - 1; i >= 0; i--) {
            if (nums[i] > 0) {
                if (set.contains(nums[i] * -1)) {
                    return nums[i];

                }
            }
        }
        return -1;
    }
}