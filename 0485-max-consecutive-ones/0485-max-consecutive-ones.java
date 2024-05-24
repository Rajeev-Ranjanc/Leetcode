class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        
 /*
    Pretty simple and forward we declare two variable one is cnt to count consecutive 1 and max is
    for storing maximum consecutive and run a loop check if it 1 then increase cnt by one and store
    int max var which is max either max or cnt otherwise cnt become zero
 */
        int cnt = 0;
        int max = 0;
        for (int num : nums) {
            if (num == 1) {
                cnt++;
                max = Math.max(max, cnt);
            } else {
                cnt = 0;
            }
        }
        return max;
    }
}