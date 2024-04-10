class Solution {
    public int[] deckRevealedIncreasing(int[] deck) {
        /*
At first sort the array and then start putting array elements alternately in ans array and finally return them we have to revel 3 just after 2 so 2 and 3 cannot be adjacent so we make a gape and remove the
2 _ 3 _ 5 _ 7
      11
  13      7
*/
         int[] ans = new int[deck.length];
        int n = deck.length;
        Arrays.sort(deck);
        int i = 0;
        int j = 0;
        boolean skip = false;
        while (i < n) {
            if (ans[j] == 0) {//ans array khali hai
                if (!skip) {
                    ans[j] = deck[i];
                    i++;
                }
                skip = !skip; // invert the skip boolean variable
            }
            j = (j + 1) % n;
        }
        return ans;
    }
}