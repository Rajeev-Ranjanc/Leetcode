class Solution {
    public boolean isAcronym(List<String> words, String s) {
        //just declare a String type variable then add the first element of every words into them
        // and check is that string is equal to the s string
         String ans="";
        for (String word : words) {
            ans += word.charAt(0);
        }
        return ans.equals(s);
    }
}