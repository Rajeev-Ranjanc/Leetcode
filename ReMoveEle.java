//https://leetcode.com/problems/remove-element/
//RemoveDuplicate elements from sorted array
/*
in this I had to remove elements
 */
import java.util.Stack;


public class ReMoveEle {
    public static void main(String[] args) {
       int[] nums = {3,2,2,3};
       int val = 3;
        System.out.println (removeElement ( nums , val ));
    }

    public static int removeElement(int[] nums, int val) {
        Stack<Integer> st = new Stack<> ();
        for (int i = 0; i < nums.length; i++) {
            if(nums[i]!=val){
                st.push ( nums[i] );
            }
        }
        for (int i = 0; i < st.size (); i++) {
            nums[i] = st.get ( i );
        }
        return st.size ();
    }
}
