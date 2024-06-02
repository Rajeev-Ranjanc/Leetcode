class Solution {
   public static List<List<Integer>> permute(int[] nums) {

        List<List<Integer>> list = new ArrayList<>();
        helper(nums, 0, list);
        return list;

    }

    public static void helper(int[] nums, int index, List<List<Integer>> list) {
        
        if (index == nums.length) {
            List<Integer> a = new ArrayList<>();
            for (int num : nums) {
                a.add(num);
            }
            list.add(a);
            return;
        }

        // Recursively generate permutations
        for (int i = index; i < nums.length; i++) {
            swap(nums, index, i);
            helper(nums, index + 1, list);
            swap(nums, index, i);// next swapp for
        }
    }

    public static void swap(int[] nums, int f, int s) {
        int temp = nums[f];
        nums[f] = nums[s];
        nums[s] = temp;

    }

}