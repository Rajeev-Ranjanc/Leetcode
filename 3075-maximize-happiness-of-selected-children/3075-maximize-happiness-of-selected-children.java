class Solution {
    public long maximumHappinessSum(int[] happiness, int k) {
            
        long ans = 0;
        Arrays.sort(happiness);
        int index = happiness.length - 1;
        int count = 0;
        while (k-- > 0) {

            if ((happiness[index] - count) > 0) {
                ans += happiness[index] - count;
            }
            else {
                ans+=0;
            }
            index--;
            count++;

        }


        return ans;
        
        
    }
}