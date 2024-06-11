class Solution {
    public int longestOnes(int[] nums, int k) {
        /*
        
        This is better according to striver because  TC : O(2N) & SC : O(N)
            
        Simply ran a while loop till j is less than the nums.length & check if nums[i] is equal to the 0 then
        increase the count of zero and if zero is greater than k again ran a loop till no of zeros is greater
        than the k increased i and decreased zeros if nums[i] is 0 and then store maximum val everytime into ans
        variable and increased the jth
        
       
        int i = 0;
        
        int j = 0;
        
        int ans = 0;
        
        int zeros = 0;

        while (j < nums.length) {

            if (nums[j] == 0) {
                
                zeros++;
                
            }

            while (zeros > k) {

                if (nums[i] == 0) {
                    zeros--;
                }
                
                i++;
            }
            
            ans = Math.max(ans, j - i + 1);

            j++;
        }
        
        return ans;
        
    */
        /*
            Optimal solution SC : O(1) && TC : O(N)
            There is nothing big changes only change is that I'm updating the max only when no of zero is less
            or equal than the k
         */

        int i = 0;
        int j = 0;
        int ans = 0;
        int zero = 0;

        while (j < nums.length) {

            if (nums[j] == 0) {
                zero++;
            }

            if (zero > k) {

                if (nums[i] == 0) {
                    zero--;
                }

                i++;
            }
            
            ans = Math.max(ans, j - i + 1);
            
            j++;
        }
        
        return ans;
        
    }
}