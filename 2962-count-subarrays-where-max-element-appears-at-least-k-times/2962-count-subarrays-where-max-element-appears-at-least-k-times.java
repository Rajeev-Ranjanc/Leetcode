class Solution {
    public long countSubarrays(int[] nums, int k) {
        /*
        
        */
       int i = 0;
        int j = 0;
        long n = nums.length;
        long maxelement = Long.MIN_VALUE;
        long count = 0;

        //finding maximum elements
        for (long num : nums) {
           maxelement  = Math.max(maxelement , num);
        }

        ///now apply sliding window
        long countmaximum = 0;
        while (j < nums.length) {
            if (nums[j] == maxelement) {
                countmaximum++;
            }

            while (countmaximum >= k) {

                count += n - j;
                if (nums[i] == maxelement) {
                    countmaximum--;
                }

                i++;
            }

            j++;
        }

        return count;
    }
}