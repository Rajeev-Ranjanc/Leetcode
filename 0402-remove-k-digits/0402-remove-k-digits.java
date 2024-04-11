class Solution {
    public String removeKdigits(String num, int k) {
         Stack<Integer> st = new Stack<>();
        for (int i = 0; i < num.length(); i++) {
            int ch = Integer.parseInt(String.valueOf(num.charAt(i)));

            while (!st.isEmpty() && st.peek() > ch && k > 0) {
                st.pop();
                k--;
            }
            st.push(ch);
        }

// Remove remaining elements to ensure k digits are removed when every element's in stack are in increasing order
//        then all elements will get into stack but still we will have to remove k no of elements so i did this
        while (k > 0 && !st.isEmpty()) {
            st.pop();
            k--;
        }
        String ans = "";
        while (st.size() != 1 && !st.isEmpty() ) {
            int ch = st.firstElement();
            if (!(ans.isEmpty() && ch == 0)) {
                ans += ch;
            }
            st.removeFirst();
        }
        if(!st.isEmpty())
            ans += st.pop();
        if (ans.isEmpty()) {
            return "0";
        }
        return ans;
    }
}