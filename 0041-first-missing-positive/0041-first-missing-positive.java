class Solution {
    public int firstMissingPositive(int[] nums) {
       //its hard problem because problems doesn't tell that there is range to from
        // 1 to N it's not telling its just saying  smallest +ve number which indicates cyclic          //sort
        //Approach would be
        //applied cyclic sort
        //ignore -ve number elements and > N
        
        //applay cyclic sort
        //Amazon Hard Question
        
        int i = 0;
        while(i<nums.length){
            int corrext_index = nums[i]-1;
            if(nums[i]>0 && nums[i]<=nums.length && nums[i] != nums[corrext_index]){
                swap ( nums , i , corrext_index );
            }
            else{
                i++;
            }
        }
        //now check which isn't at own index
//        for(int index = 0;index<nums.length;index++){
//            if(nums[index] != index+1){
//                return index+1;
//            }
//        }
        //search for first missing number
        for(int index = 0;index<nums.length;index++){
            if(nums[index] != index + 1){
                return index+1;
            }
        }
     return nums.length+1;
    }

    //function for swapping the values
    static void swap(int[] nums , int first , int second){
        int temp = nums[first];
        nums[first] = nums[second];
        nums[second] = temp;
    }
    

}