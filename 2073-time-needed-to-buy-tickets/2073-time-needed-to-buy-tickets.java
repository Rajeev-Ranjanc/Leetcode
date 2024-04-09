class Solution {
    public int timeRequiredToBuy(int[] tickets, int k) {
        /*
        we need to write the comment here
        */
         int ans = 0;
        int n = tickets.length;
        for (int i = 0; i < n; i++) {
            if (i <= k) {
                ans += Math.min(tickets[i], tickets[k]);
            }
            else{
                ans+=Math.min(tickets[k]-1 , tickets[i]);
            }

        }
        return ans;
    }
}