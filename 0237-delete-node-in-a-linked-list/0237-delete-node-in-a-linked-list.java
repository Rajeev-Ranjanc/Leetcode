/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public void deleteNode(ListNode node) {
        /*
            this question is asking we just need to remove the link which is connected to the
            next node of this and the node which is given is the previous node of that node which
            is to be remove
        */
        node.val = node.next.val;
        node.next = node.next.next;
    }
}