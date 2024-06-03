class Solution {
    public int appendCharacters(String s, String t) {
        int i = 0;
        int j = 0;
        int m = 0;
        int n = 0;
        while (m < s.length() && n < t.length()) {
            
            if (s.charAt(i) == t.charAt(j)) {
                i++;
                j++;
                m++;
                n++;
            } else {
                i++;
                m++;
            }
            
           
        }
        return t.length() - j;
        
    }
}