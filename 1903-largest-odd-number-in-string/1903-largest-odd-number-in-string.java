class Solution {
    public String largestOddNumber(String num) {
        
          int n = num.length();
        for (int i = n - 1; i >= 0; i--) {
            int ch = Integer.parseInt(String.valueOf(num.charAt(i)));
            
            if (ch % 2 == 0) {
                num = num.substring(0, i);
            } else {
                break;
            }

        }
        return num;
        
    }
}