/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode detectCycle(ListNode head) {
  
        
/*
raghav sir logic

First detect the cycle using slow and fast pointer. Once you know that there is cycle present in the list
then declare a temp variable node from start and keep moving temp and slow pointer by one it will always
meet at a node and that node will be the start of cycle node always

*/
        
        //base case
        if(head == null || head.next == null){
            return null;
        }

        ListNode slow = head;
        ListNode fast = head;
        
        ListNode temp = head;


        while (fast != null && fast.next != null) {

            slow = slow.next;
            fast = fast.next.next;

//            if there will be cycle then it will be break
            if (slow == fast) {
                break;
            }

        }

        if (slow != fast) {
//            it means there is no cycle
            return null;
        }


        while (slow != temp) {
            
            slow = slow.next;
            temp = temp.next;
            
        }

        return slow;
    }
}