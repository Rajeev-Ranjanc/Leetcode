class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        //process of  solving ->
        //1. apply cyclic sort 
        //2.then check which is not at right index
        List<Integer> ans = new ArrayList<>();
        //apply cyclic sort
        int i = 0;
        while(i<nums.length){
            int correct_index = nums[i]-1;
            if(nums[i] != nums[correct_index]){
                swap(nums , i , correct_index);
            }
            else{
                i++;
            }
        }//cyclic sort applied
        
        //now check which elements isn't at right index
        for(int index = 0 ;index<nums.length;index++){
            if(nums[index]-1 != index){
                ans.add(nums[index]);
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