class Solution {
    public int maxDepth(String s) {
         int count = 0;
        int result = 0;
        Stack<Character> st = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '(') {
                count++;
            } else if (s.charAt(i) == ')') {
                result = Math.max(result, count);
                count--;
            }
        }
        return result;
    }
}