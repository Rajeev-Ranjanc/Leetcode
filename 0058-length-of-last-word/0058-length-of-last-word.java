class Solution {
    public int lengthOfLastWord(String s) {
/*
        this question can also say that find the longest comman prefix in this problem I am shifting right           elements of both left and right
        until it becomes equal later we can shift that no of left shift which i have put right shift any            number eft or right because both are equals now
 */
        s = s.trim();
        int count = 0;
        for (int i = 0; i < s.length(); i++) {
            count++;
            if (s.charAt(i) == ' ') {
                count = 0;
            }
        }
        return count;
    }
}