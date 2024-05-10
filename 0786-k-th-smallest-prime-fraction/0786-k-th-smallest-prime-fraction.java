class Solution {
    public int[] kthSmallestPrimeFraction(int[] arr, int k) {
        
/*
        Although this solution is in the O(n^2) but still did it by self so much excitement comes with this
        so to solve this I have created an ArrayList in this I store the result of the Arr[i] / arr[j] and
        sorted them in ascending order and again starts checking is arr[i] / arr[j] == arraylist.get(k-1)
        if yes then return the value of arr[i] and arr[j] otherwise finally return an empty array this is not
        optimal but yeah it id submitted in the 0(N^2) and beats is of Your runtime beats 56.33 % of java 
        submissions.

 */
        
        ArrayList<Double> ans = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                ans.add((double) arr[i] / arr[j]);
            }
        }
        Collections.sort(ans);
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if ((double) arr[i] / arr[j] == ans.get(k-1)) {
                    return new int[]{arr[i], arr[j]};
                }
            }
        }

        return arr;
        
        
    }
}