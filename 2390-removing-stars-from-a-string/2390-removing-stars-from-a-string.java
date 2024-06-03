class Solution {
    public String removeStars(String s) {
        /*
            Nothing fancy simply if character of string is not * push into
            stack if it is * then remove a character from stack and again
            fetch all character from stack and return them.
            
         */
      Stack<Character> stack = new Stack<>();

        for (char ch : s.toCharArray()) {

            if (ch != '*') {
                stack.push(ch);
            } else {
                stack.pop();
            }

        }

        s = "";

        for (char ch : stack) {
            s += ch;
        }

        return s;
        
    }
}