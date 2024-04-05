class Solution {
    public String makeGood(String s) {
        //useless fellow i can do also do this question via stack 
        StringBuilder result = new StringBuilder();

        for (char ch : s.toCharArray()) {
            
            if (!result.isEmpty() && (ch + 32 == result.charAt(result.length() - 1) || ch - 32 == result.charAt(result.length() - 1))) {
                result.deleteCharAt(result.length() - 1);
            } else {
                result.append(ch);
            }
        }

        return result.toString();
    }
}