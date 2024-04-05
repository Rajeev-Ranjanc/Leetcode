class Solution {
    public boolean isAcronym(List<String> words, String s) {
        //just declare a String type v
         String ans="";
        for (String word : words) {
            ans += word.charAt(0);
        }
        return ans.equals(s);
    }
}