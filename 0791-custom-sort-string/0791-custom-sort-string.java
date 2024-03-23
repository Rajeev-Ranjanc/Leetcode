class Solution {
    public String customSortString(String order, String s) {
        Map<Character, Integer> map = new HashMap<>();
for (int i = 0; i < s.length(); i++) {
    map.put(s.charAt(i), map.getOrDefault(s.charAt(i), 0) + 1);
}
String str = "";
for (char ch : order.toCharArray()) {
    if (map.containsKey(ch)) {
        while (map.get(ch) != 0) {
            str += ch;
            map.put(ch, map.get(ch) - 1);
        }
        if (map.get(ch) == 0) {
            map.remove(ch);
        }
    }
}

for (char ch : map.keySet()) {
    while (map.get(ch) != 0) {
        str += ch;
        map.put(ch, map.get(ch) - 1);
    }
}

return str;

        }

    }