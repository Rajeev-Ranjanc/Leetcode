class Solution {
    public String countAndSay(int n) {
        
//        Base case
        if (n == 1) {
            return "1";
        }

//        recursive call
        String s = countAndSay(n - 1) + '@';
        String ans = "";
//        @ -> trick (hack) otherwise we will have to add last occurrences outside the while loop once
//        by this we don't need to do this
        int i = 0;
        int j = 0;
        while (j < s.length()) {
            
            if (s.charAt(i) == s.charAt(j)) {
                j++;
            } else {
                int count = j - i;
                ans += count;
                ans += s.charAt(i);
                i = j;
            }
        }
        return ans;

    }
}