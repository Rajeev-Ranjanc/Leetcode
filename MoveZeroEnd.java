//https://leetcode.com/problems/move-zeroes/
/*
we can move all zero -> we can copy all the elements of the org. array into another list and add into last of original array
 */
import java.util.ArrayList;
import java.util.Arrays;


public class MoveZeroEnd {
    public static void main(String[] args) {
        int[] nums = { 0 ,0, 0, 1};
//        moveZeroes ( nums );
        movezeroOptimalWay ( nums );
        System.out.println ( Arrays.toString (nums));
    }
    public static void movezeroOptimalWay(int[] nums){
        for (int i = 1; i < nums.length; i++) {
            if(nums[i-1]!=0){
                swap ( nums , i-1 , i );
            }
        }
    }
    public static void swap(int[] nums , int first , int second){
        int temp = nums[first];
        nums[first] = nums[second];
        nums[second]  = temp;
    }

    public static void moveZeroes(int[] nums) {

        //that's a brute force approach
        ArrayList<Integer> list = new ArrayList<> ();

        //copying all zero into a list
        for (int i = 0; i < nums.length; i++) {
            if(nums[i]!=0){
                list.add ( nums[i] );
            }
        }
        //size of the list
        int size = list.size ();
        //putting elements of the list into array
        for (int i = 0; i < size; i++) {
            nums[i] = list.get ( i );
        }
        for (int i = size; i < nums.length; i++) {
            nums[i] = 0;
        }

    }
}
