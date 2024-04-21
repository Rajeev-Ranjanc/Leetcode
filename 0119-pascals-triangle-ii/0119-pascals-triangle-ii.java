class Solution {
    public List<Integer> getRow(int rowIndex) {
        /*
        int this first we create an arraylist and added one in that list and that list again added into another arraylist everytime
and then again second time we run two loop and set the value of internal arraylist to the sum of previous arraylist.get
i + previous arraylist.get i-1 and finally return that arraylist.

We can optimize this code by this approach we can see that we are adding 1 only when the col is 0 or col is lst and nest time
we are doing same previous procedure, so we can do this via if  j==0 || j==i then add 1 otherwise follow that rules.

 */
         List<List<Integer>> ans = new ArrayList<>();

        for (int i = 0; i <= rowIndex; i++) {
            List<Integer> list = new ArrayList<>();
            for (int j = 0; j <= i; j++) {
                if (j == 0 || j == i) {
                    list.add(1);
                } else {
                    list.add(ans.get(i - 1).get(j) + ans.get(i - 1).get(j - 1));
                }
            }
            ans.add(list);
        }
        return ans.get(rowIndex);
        
       
    }
}