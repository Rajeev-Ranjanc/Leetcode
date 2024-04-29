class Solution {
    public int compress(char[] chars) {
           int i = 0;
        int j = 0;
        int n = chars.length;
        StringBuilder sbr = new StringBuilder();

        while (j < n) {
            if (chars[i] == chars[j]) {
                j++;
            } else {
                int c = j - i;
                if (c > 1) {
                    sbr.append(chars[i]);
                    sbr.append(c);
                } else {
                    sbr.append(chars[i]);
                }
                i = j;
            }

        }
        sbr.append(chars[i]);
        int c = j - i;
        if (c > 1) {
            sbr.append(c);
        }


        for (int k = 0; k < sbr.length(); k++) {
            chars[k] = sbr.charAt(k);
        }
//        System.out.println(Arrays.toString(chars));
//        System.out.println(sbr);
        return sbr.length();
    }
}