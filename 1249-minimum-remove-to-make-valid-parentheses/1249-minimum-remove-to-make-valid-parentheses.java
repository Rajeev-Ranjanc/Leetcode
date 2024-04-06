class Solution {
    public String minRemoveToMakeValid(String s) {
        Stack<Integer> st = new Stack<>();

        Set<Integer> set = new TreeSet<>();

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '(') {
                st.push(i);
            } else if (s.charAt(i) == ')') {
                if (st.isEmpty()) {
                    set.add(i);
                } else {
                    st.pop();
                }
            }
        }

        while (!st.isEmpty()) {
            set.add(st.lastElement());
            st.pop();
        }

        String ans = "";
        for (int i = 0; i < s.length(); i++) {
            if (!set.contains(i)) {
                ans += s.charAt(i);
            }
        }
        return ans;
    }
}