class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        //Google Asked
        //there is number from 1 to N so blindly apply cyclic sort
        //creting a new list which i have to return
        List<Integer> mylist = new ArrayList<> ();
        int i = 0;
        //applying cyclic sort
        while(i<nums.length){
            int correct_index = nums[i]-1;
            if(nums[i] != nums[correct_index]){
                swap(nums , i , correct_index);
            }
            else{
                i++;
            }
        }
        //array is sorted
        //now check which number isn't present in the array
        for (int j = 0; j < nums.length; j++) {
            if(nums[j] != j+1 ){
                mylist.add ( j+1 );
            }
        }

        return mylist;
    }
    private static void  swap(int[] nums , int first , int  second){
        int temp = nums[first];
        nums[first] = nums[second];
        nums[second] = temp;
    }
    
}