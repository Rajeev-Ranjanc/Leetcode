class Solution {
    public int[] rearrangeArray(int[] nums) {
        /*
        In this I'm taking two pointer one for the positive value and other one is for the
        negative value and starts from pos by 0 and neg by 1 because we have to start from positive
        one and if we got the positive number then put in ans[pos] and incerese the pos by 2 ans same with
        the negative variable
        */
        int[] ans = new int[nums.length];
        int index = 0;
        int neg = 1;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > 0) {
                ans[index] = nums[i];
                index += 2;
            } else {
                ans[neg] = nums[i];
                neg+=2;
            }
        }
        return ans;
    }
}