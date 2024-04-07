class Solution {
    public boolean checkValidString(String s) {
        int open = 0;
        int close = 0;


        //left to right check open brackets
        for (int i = 0; i < s.length(); i++) {

            char ch = s.charAt(i);

            if (ch == '(' || ch == '*') {
                open++;
            } else {
                open--;
            }

            if (open < 0) {
                return false;
            }
        }

//        right to left for close brackets
        for (int i = s.length() - 1; i >= 0; i--) {
            char ch = s.charAt(i);
            if (ch == ')' || ch == '*') {
                close++;
            } else {
                close--;
            }
            if (close < 0) {
                return false;
            }
        }
        return true;

    }
}