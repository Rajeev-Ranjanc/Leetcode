/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode partition(ListNode head, int x) {
        
        ListNode dummyA = new ListNode(-1);
        ListNode dummyB = new ListNode(-1);

        ListNode tempA = dummyA;
        ListNode tempB = dummyB;

        ListNode temp = head;
        while (temp != null) {

            if (temp.val < x) {
                tempA.next = temp;
                tempA = tempA.next;
            } else {
                tempB.next = temp;
                tempB = tempB.next;
            }
            temp = temp.next;

        }
        tempA.next = dummyB.next;
        tempB.next = null;
        
        return dummyA.next;
    
    }
}