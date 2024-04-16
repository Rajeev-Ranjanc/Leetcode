class Solution {
    public int maxProduct(int[] nums) {
         int ans = Integer.MIN_VALUE;
        for (int i = 0; i < nums.length; i++) {
            int a = 0;
            for (int j = 0; j < nums.length; j++) {
                if (i != j)
                    a = (nums[i] - 1) * (nums[j] - 1);
                ans = Math.max(a, ans);
            }
//            System.out.print(ans+" ");
        }
        return ans;
    }
}