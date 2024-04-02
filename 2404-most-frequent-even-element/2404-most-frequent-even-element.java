class Solution {
    public int mostFrequentEven(int[] nums) {
/*
    I have approached this problem using Hashmaps I have put all the even element of the array in the Map and     count the number
    of frequency each & every element, and we find the maximum frequencies among all the numbers and then         iterate over the keyset
    of the hashmaps and if we find the equal no of highest frequent elements we return that key. One more           thing I took Treemap so
    if we find the same frequent element twice then i can return the smaller one and I submitted them
*/
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