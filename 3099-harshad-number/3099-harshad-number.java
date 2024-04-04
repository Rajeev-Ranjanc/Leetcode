class Solution {
    public int sumOfTheDigitsOfHarshadNumber(int x) {
        
        int sum = 0;
        int org = x;
        
        while (org > 0) {
            
            int rem = org % 10;
            
            sum += rem;
            
            org = org / 10;
            
        }

        if (x % sum == 0) {
            return sum;
        }
        return -1;
    }
}