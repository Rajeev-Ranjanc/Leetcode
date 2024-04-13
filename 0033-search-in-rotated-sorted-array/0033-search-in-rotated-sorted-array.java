class Solution {
    public int search(int[] nums, int target) {
        return helper(nums , target , 0 , nums.length-1);
    }
    
    //rotated binary search using recursion
    public int helper(int[] nums , int target , int start , int end){
        
        if(start > end){
            return -1;
        }
        //calculate mid
        int mid = start + (end - start)/2;
        
        if(target == nums[mid]){
            return mid ;
        }
        
        if(nums[start] <= nums[mid]){
            //first part of the array is sorted
            
            if(target >= nums[start] && target <= nums[mid]){
                //first part of the array is sorted
                return helper(nums , target , start , mid-1);
            }
            else{
                return helper(nums , target , mid + 1, end);
            }
        }
        
        if(target>=nums[mid] && target <= nums[end]){
            //it means second part of the array is sorted
            return helper(nums , target , mid + 1 , end);
        }
        return helper(nums , target , start , mid -1);
        
    }
    
}