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
    public ListNode removeNodes(ListNode head) {
         if(head == null || head.next == null){
            return head;
        }

        ListNode newHead = removeNodes(head.next);
        if(head.val<newHead.val){
            //
//            delete(head);
            return newHead;
        }
        else{
            head.next = newHead;
            return head;
        }
    }
}