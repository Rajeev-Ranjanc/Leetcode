class Solution {
    public int[] kthSmallestPrimeFraction(int[] arr, int k) {
        
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