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
            
            Same question is on gfg naing delete withour head pointer in which we just need to delete the
            present node data from the next node or we an say that we just need to copy the data 
            of its net node to the previous node
        */
        node.val = node.next.val;
        node.next = node.next.next;
    }
}