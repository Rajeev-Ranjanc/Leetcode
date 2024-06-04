class Solution {
    public int longestPalindrome(String s) {
        
        int ans = 0;
        Set<Character> set = new HashSet<>();
        for (char ch : s.toCharArray()) {
            if (set.contains(ch)) {
                set.remove(ch);
                ans += 2;
            } else {
                set.add(ch);
            }
        }
        if (set.isEmpty()) {
            return ans;
        }
        return ans + 1;
        
    }
}