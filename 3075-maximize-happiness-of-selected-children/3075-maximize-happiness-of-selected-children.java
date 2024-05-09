class Solution {
    public long maximumHappinessSum(int[] happiness, int k) {/*
        Not pretty hard simple and forward as we have to store maximum k element from array but after every selection
        other elements will decrease by one and finally produce ans to implement this I just took a variable of return
        type and sort the array and start traversing from behind of the array and everytime once I consider any number
        as answer+ then decreases the index sp first i can select last biggest and then second last and then third last
        and so on and every time before adding any happiness element into the answer we subtract a value which is count
        which decreases by one on every selection of any element from the array and finally returned the ans don't forget
        to take ans of long type I got an error when I took the ans as of integer type so take answer as of long type
 */
            
        long ans = 0;
        Arrays.sort(happiness);
        int index = happiness.length - 1;
        int count = 0;
        while (k-- > 0) {

            if ((happiness[index] - count) > 0) {
                ans += happiness[index] - count;
            }
            else {
                ans+=0;
            }
            index--;
            count++;

        }


        return ans;
        
        
    }
}