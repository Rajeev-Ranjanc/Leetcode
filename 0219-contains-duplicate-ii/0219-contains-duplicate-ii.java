class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
       
/*
    I'm approaching this problem using hashmaps in that we first we simply declare a hashmaps and
    i that I'm storing numbers of array as key and their indexes as the value if any elements of I
    does not appear into the array only then I'm inserting that element into that map otherwise I'm
    checking the previous Index and present Indexes differences is less than or equal to k or not if
    not then again I'm updating the previous indexes for the future check and done
 */

         Map<Integer, Integer> map = new TreeMap<>();
        for (int i = 0; i < nums.length; i++) {
            if(!map.containsKey(nums[i])){
                map.put(nums[i] , i);
            }
            else{
                int ans = Math.abs(map.get(nums[i]) - i);
                if(ans<=k){
                    return true;
                }
                else{
                    map.put(nums[i] , i);
                }
            }
        }
//        System.out.println(map);
        return false;
    }
}