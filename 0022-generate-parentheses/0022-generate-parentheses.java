class Solution {
    public List<String> generateParenthesis(int n) {
        
        List<String> ans = new ArrayList<>();
        helper(0, 0, n, "", ans);
        return ans;

    }
    
   public void helper(int opening, int closing, int n, String s, List<String> ans) {
       
//        at the interview time check striver sheet for hot=nt and that is important

//        Base case
        if (s.length() == 2 * n) {
            ans.add(s);
            return;
        }

//        Opening call when we will call opening? when the opening is less than n
        if (opening < n)
            helper(opening + 1, closing, n, s + "(", ans);
       
//        closing call when? when there will close less than open only then
        if (closing < opening)
            helper(opening, closing + 1, n, s + ")", ans);

    }
}