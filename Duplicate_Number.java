//https://leetcode.com/problems/find-the-duplicate-number/description/
public class Duplicate_Number {
    public static void main(String[] args) {
        int[] nums = {1,3,4,2,2};
        System.out.println (findDuplicate ( nums ));
    }
    public static int findDuplicate(int[] nums) {
        int num = nums.length-1;
        int sumOfNatural = num*(num+1)/2;
        int arrsum = 0;
        for (int i = 0; i < nums.length; i++) {
            arrsum+=nums[i];
        }
        return arrsum - sumOfNatural;
    }
}