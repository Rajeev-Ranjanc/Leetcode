class Solution {
    public int scoreOfString(String s) {
        //contest solving
         char[] ch =s.toCharArray();
        int ans = 0;
        for (int i = 0; i < s.length()-1; i++) {
            ans+=Math.abs(ch[i] - ch[i+1]);

        }
//        System.out.println(ans);
        return ans;
    }
}