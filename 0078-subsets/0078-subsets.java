class Solution {
    
    static List<List<Integer>> list;
    
    public List<List<Integer>> subsets(int[] nums) {
        
        list = new ArrayList<>();

        ArrayList<Integer> arr = new ArrayList<>();
        helper(0, nums, arr);

        return list;
        
    }
     public static void helper(int index, int[] nums, ArrayList<Integer> arr) {

        if (index == nums.length) {
            list.add(new ArrayList<>(arr)); // Add a new copy of arr
            return;
        }

        int num = nums[index];

        // Not take the current element
        helper(index + 1, nums, new ArrayList<>(arr));

        // Take the current element
        arr.add(num);
        helper(index + 1, nums, new ArrayList<>(arr));
    }
}