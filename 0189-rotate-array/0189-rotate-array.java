class Solution {
    public void rotate(int[] nums, int k) {
/*
        In this problem I have approached this first I reverse entire array, and then I have revered till           the Kth item and after that 
        again I reversed the rest array from k+1 to length of the array and finally simply returns
*/
        int n = nums.length;
        k = k % n;
        
        //reversing entire array
        for (int i = 0; i < n / 2; i++) {
            swap(nums, i, n - 1 - i);
        }
        
        //reversing upto kth element
        for (int i = 0; i < k / 2; i++) {
            swap(nums, i, k - i - 1);
        }
        //now again reversing rest half of the array
        for (int i = k; i < (n + k) / 2; i++) {
            swap(nums, i, (n + k - 1 - i));
            // System.out.println();
//            System.out.println(i + " " + (n + k - 1 - i));
        }

    }

    public static void swap(int[] nums, int first, int second) {
        int temp = nums[first];
        nums[first] = nums[second];
        nums[second] = temp;
    }
}