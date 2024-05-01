class Solution {
    public String reversePrefix(String word, char ch) {
         StringBuilder sbr = new StringBuilder();
        int i = 0;
        for (int j = 0; j < word.length(); j++) {
            if (word.charAt(j) == ch) {
                sbr.append(word.charAt(j));
                i = j + 1;
                break;
            }
            sbr.append(word.charAt(j));
        }
//        sbr = sbr.append(word.charAt(i));
        if (i != 0) {
        sbr = sbr.reverse();

            while (i < word.length()) {
                sbr.append(word.charAt(i));
                i++;
            }
        }
        return sbr.toString();
    }
}