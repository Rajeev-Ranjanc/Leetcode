class Solution {
    public String replaceDigits(String s) {
        
        char[] ch = new char[s.length()];
        for (int i = 0; i < s.length(); i++) {
            if (i % 2 == 0) {
                ch[i] = s.charAt(i);
            } else {
                ch[i] = (char) (Integer.parseInt(String.valueOf(s.charAt(i))) + ch[i - 1]);
            }
        }
        String ans = "";
        for (int i = 0; i < s.length(); i++) {
            ans += ch[i];
        }
        return ans;
    }
}