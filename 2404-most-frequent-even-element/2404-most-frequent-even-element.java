class Solution {
    public int mostFrequentEven(int[] nums) {
        Map<Integer, Integer> map = new TreeMap<>();
        for (int num : nums) {
            if ((num % 2) == 0) {
                map.put(num, map.getOrDefault(num, 0) + 1);
            }
        }
        int maxfr = Integer.MIN_VALUE;
        for (int f : map.values()) {
            maxfr = Math.max(maxfr, f);
        }

        for (int num : map.keySet()) {
            if (map.get(num) == maxfr) {
                return num;
            }
        }
        return -1;

    }
}