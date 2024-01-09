class Solution {
    public int findDuplicate(int[] nums) {
        //completed by myself
         //there is number from [1 N] so blindly apply cyclic sort
        //applying cyclic sort
//         int i = 0;
//         int dup = 0;
//         while (i < nums.length) {
//             int correct_index = nums[i]-1;
//             if (nums[i] < nums.length && nums[i] != nums[correct_index]) {
//                 swap ( nums, i, correct_index );
//             } else {
//                 dup = nums[i]; //thoughts was mine and leetcode accepted it wow
//                 i++;

//             }
//         }
//         return dup;

    //kunal
        int i =0;
        while(i<nums.length){
            if(nums[i] != i+1){
                int correct_index = nums[i]-1;
                if(nums[i] != nums[correct_index]){
                    swap(nums , i , correct_index);
                }
                else{
                    return nums[i];
                }
                
            }
            else{
                i++;
            }
        }
        return -1;
    }
    
    
    
    //swapping the value of the array
    public static void swap(int[] nums, int first, int second) {
        int temp = nums[first];
        nums[first] = nums[second];
        nums[second] = temp;
    }
}