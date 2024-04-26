class Solution {
    public String reverseWords(String s) {
       // String ans = "";
       //  Stack<Character> stack = new Stack<>();
       //  for (int i = 0; i < s.length(); i++) {
       //      char ch = s.charAt(i);
       //      if (ch != ' ') {
       //          stack.push(ch);
       //      } else {
       //          while (!stack.isEmpty()) {
       //              ans += stack.pop();
       //          }
       //          ans += " ";
       //      }
       //  }
       //  while (!stack.isEmpty()) {
       //      ans += stack.pop();
       //  }
       //  return ans;
        StringBuilder sb = new StringBuilder(s);
       
        int i = 0;
        int j = 0;
        int n = s.length();
        while(j<n){
            if (sb.charAt(j) != ' ') {
                j++;
            } else {
                reverse(sb, i, j - 1);
                i = j + 1;
                j = i;
            }
        }
         reverse(sb, i, j - 1);
        return sb.toString();
        
    }
        
    
     public static void reverse(StringBuilder sb, int i, int j) {
        //now reverse from i to j how?? by swapping!
        while (i <= j) {
            char ch = sb.charAt(i);
            sb.setCharAt(i, sb.charAt(j));
            sb.setCharAt(j, ch);
            i++;
            j--;
        }

    }
}