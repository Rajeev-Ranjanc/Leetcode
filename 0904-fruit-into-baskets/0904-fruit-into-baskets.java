class Solution {
    public int totalFruit(int[] fruits) {
        
        int i = 0;
        int j = 0;
        int ans = 0;

        Map<Integer, Integer> map = new HashMap<>();

        while (j < fruits.length) {

            map.put(fruits[j], map.getOrDefault(fruits[j], 0) + 1);

            if (map.size() > 2) {

                while (map.size() > 2) {

                    map.put(fruits[i], map.get(fruits[i]) - 1);

                    if (map.get(fruits[i]) == 0) {

                        map.remove(fruits[i]);

                    }

                    i++;

                }

            }
            
            ans = Math.max(ans, j - i + 1);
            
            j++;

        }
        
        return ans;
    }
}