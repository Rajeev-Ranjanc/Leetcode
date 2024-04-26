class Solution {
    public String reverseOnlyLetters(String s) {
        /*
        Its a simple if else case if the present both charcters is from Capital letters or Small Letters then           only swap otherwise check which is not are alphabet increase or decrease the i , j according to them which is not letters 
        */
        StringBuilder sbr = new StringBuilder(s);
        int i = 0;
        int j = s.length() - 1;
        int n = 0;
        while (i <= j) {
            char ch = s.charAt(i);
            char ch2 = s.charAt(j);
            if ((ch >= 65 && ch <= 90 || ch >= 97 && ch <= 122) && (ch2 >= 65 && ch2 <= 90 || ch2 >= 97 && ch2 <= 122)) {
                //do swap
                char ch3 = ch;
                sbr.setCharAt(i, ch2);
                sbr.setCharAt(j, ch3);
                i++;
                j--;

            } else if (ch >= 65 && ch <= 90 || ch >= 97 && ch <= 122) {
                j--;
            } else {
                i++;
            }
        }
        return sbr.toString();
    }
}