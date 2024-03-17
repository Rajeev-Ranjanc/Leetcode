class Solution {
    public List<Integer> intersection(int[][] nums) {
         int n = nums.length;

        Map<Integer, Integer> map = new HashMap<>();
        for (int[] num : nums) {
            for (int i : num) {
                map.put(i, map.getOrDefault(i, 0) + 1);
            }
        }

        ArrayList<Integer> list = new ArrayList<>();
        for (int key : map.keySet()) {
            if (map.get(key) >= n) {
                list.add(key);
            }
        }
        Collections.sort(list);
        return list;
    }
}