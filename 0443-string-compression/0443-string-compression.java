class Solution {
    public int compress(char[] chars) {
        /*
"a","b","b","c","c","c"

https://leetcode.com/problems/string-compression/

Literally I did this Simply I approached this problem by two pointer first we initialize two variable
I and j by zero and n of length char array, and then we simply runs a while lop till j is less than the
char array length and if char[i] is equal to the char[j] then increase J else we save the difference between i and
j and if the difference is more than 1 then we add number as well as the character into the string builder otherwise
we add only characters into the stringBuilder and after traversing entire array we left a character which is equal to the
char[i] and we don't add that character after while loop and after that we run a loop to overwrite the char array by char at
i which is in the StringBuilder and returned the length of the string builder

 */
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