class Solution {
    public int numberOfSubstrings(String s) {
        
/*
In the optimal solution First of all declared an array of size 3 which is not going to take a lot
of space & in that whenever counter any alphabet then put their index in that array like for a at 0
for b at 1 & for c at 2 place. And checked everytime if all indexes become non-negative means I have   countered all three elements at least once and if I countered at least once then I can add all those characters before minimum  index that may contain all 3 characters in their substring so total no will be min(ar[0] . ar[1] , ar[2]) + 1 
and this will happen till last character of the string
 */
        
        int cnt = 0;

        int[] lastSeen = {-1, -1, -1};

        for (int i = 0; i < s.length(); i++) {

            char ch = s.charAt(i);

            lastSeen[ch - 'a'] = i;

            if (lastSeen[0] != -1 && lastSeen[1] != -1 && lastSeen[2] != -1) {

                cnt = cnt + 1 + Math.min(lastSeen[0], Math.min(lastSeen[1], lastSeen[2]));

            }
        }
        
        return cnt;
    }
}