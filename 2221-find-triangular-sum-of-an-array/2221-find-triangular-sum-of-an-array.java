class Solution {
    public int triangularSum(int[] nums) {
        
     return helper(nums , nums.length);

        
    }
     public int helper(int[] nums , int n) {
    
     for (int i = 1; i < n; i++) {

            int[] a = new int[n - i];

            for (int j = 0; j < a.length; j++) {

//                a[j] = (nums[j + 1] % 10 + nums[j] % 10) % 10;
                a[j] = (nums[j + 1] % 10 + nums[j] % 10) % 10;

            }

            nums = a;

        }

        return nums[0];
     }

    
}