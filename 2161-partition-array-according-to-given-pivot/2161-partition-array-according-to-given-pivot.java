class Solution {
    public int[] pivotArray(int[] nums, int pivot) {
        
        ArrayList<Integer> a = new ArrayList<>();
        ArrayList<Integer> b = new ArrayList<>();
        ArrayList<Integer> c = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] < pivot) {
                a.add(nums[i]);
            } else if (nums[i] == pivot) {
                b.add(nums[i]);
            } else {
                c.add(nums[i]);
            }
        }

        int l = 0;
        int i = 0;
        while (l < a.size()) {
            nums[i] = a.get(l);
            l++;
            i++;
        }
        l = 0;
        while (l < b.size()) {
            nums[i] = b.get(l);
            i++;
            l++;
        }
        l = 0;
        while (l < c.size()) {
            nums[i] = c.get(l);
            i++;
            l++;
        }

        return nums;
        
    }
}