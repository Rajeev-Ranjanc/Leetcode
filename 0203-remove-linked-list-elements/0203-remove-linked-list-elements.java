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
    public ListNode removeElements(ListNode head, int val) {
        
        //this method is correct
        if(head == null)
            return null;
        
        ListNode dummy = new ListNode();
        dummy.next = head;
        
        ListNode prev = dummy;
        
        ListNode current = head;
        
        while (current!=null){
            
            if(current.val == val){
                prev.next = current.next;
            }
            
            else {
                
                prev = current;
                
            }
            
            current = current.next;
            
        }
        
        return dummy.next;
        
    }
}