class Solution {
    public int maxDepth(String s) {
        
       /*
        this question is saying find the depth of the parenthesis
        this can be done using o(n)n extra space using stack data structure and
        otger way is by not using any data structure in this approach simply count the opening 
        parenthesis and
        if the string contain closing one then decrease the count by 1 and always store maximum 
        value before decreasing the count and finally return the maximum value;
         */
        
        int count = 0;
        int result = 0;
        
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '(') {
                count++;
            } else if (s.charAt(i) == ')') {
                result = Math.max(result, count);
                count--;
            }
        }
        return result;
    }
}