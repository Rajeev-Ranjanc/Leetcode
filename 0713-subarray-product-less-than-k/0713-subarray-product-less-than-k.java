class Solution {
    public int numSubarrayProductLessThanK(int[] nums, int k) {
        /*classic sliding window problem exactly sliding window concept
        Khandani template
        */
        if(k<=1){//mai khna chah rha hoon k = 0 and k=1 koi bhi subarray ho uska                                                product 1 se chhota ho hi nhi skta hai agar sare element 1 bhi hoto bhi sabse chhota                        subarray 1 hoga isliye return 0
            return 0;
        }
        
        int i = 0;
        int j = 0;
        int count = 0;
        int product = 1;

        while (j < nums.length) {

            product *= nums[j];

            while (product >= k ) {

                product /= nums[i];
                i++;
                
            }

            count += j - i + 1;//number of subarray ending at j
            j++;

        }
        return count;
    }
}