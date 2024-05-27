class Solution {
    public long[] sumOfThree(long num) {
        /*
            sum of 3 numbers will always be multiple of 3 means that number will always be
            divisible by 3. Sum sum of that will be x-1 + x + x+1
        */
        long[] a = new long[3];
        
        if(num%3 == 0){
            
            a[0] = (num/3) -1;
            a[1] = (num/3);
            a[2] = (num/3) + 1;
            
            return a;
            
        }
        return new long[]{};
    }
}