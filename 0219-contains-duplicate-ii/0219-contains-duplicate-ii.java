class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
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