class Solution {
    public int[] findErrorNums(int[] nums) {
        //approach
        //1.apply cyclic sort
        //2.run a loop check which isn't at right index 
        int[] ans = {-1,-1};
        //applying cyclic sort
        int i = 0;
        while (i < nums.length) {
            int correct_index = nums[i] - 1;
            if (nums[i] != nums[correct_index]) {
                swap ( nums, i, correct_index );
            } else {
                i++;
            }
        }
        //run a loop and check which is mismatched
        for (int index = 0; index < nums.length; index++) {
            if (nums[index] - 1 != index) {
                ans[0] = nums[index];
                ans[1] = index+1;
            }
        }
        return ans;        
        
    }
    public void swap(int[] nums , int first , int second){
        int temp = nums[first];
        nums[first] = nums[second];
        nums[second] = temp;
    }
}