class Solution {
    public static boolean isHappy(int n) {
        /*
    Asked in google its marked easy still in google because we can not guess that here fast and slow pointer
    concept of linked list will be used none can guess once you know it is easy problem then it is easy
    we have to apply the slow and fast pointer logic which is not understandable by just seeing the question
 */
        int slow = n;
        int fast = n;

        do {
            slow = findsquare(slow);
            fast = findsquare(findsquare(fast));
        } while (slow != fast);

        return slow == 1;
    }

    public static int findsquare(int n) {
        int ans = 0;
        while (n > 0) {
            int rem = n % 10;
            ans += rem * rem;
            n /= 10;
        }
        return ans;
    }
}