class Solution {
    public int countDistinctIntegers(int[] nums) {
        
         Set<Integer> ans = new TreeSet<>();

        for (int e : nums) {
            ans.add(e);
        }
        for (int a : nums) {
            int num = reverse(a);
            ans.add(num);
        }
        return ans.size();

    }
    public static int reverse(int num) {
        int a = 0;
        while (num > 0) {
            int rem = num % 10;
            num /= 10;
            a = a * 10 + rem;
        }
        return a;
    }
    
}