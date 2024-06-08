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
    public void reorderList(ListNode head) {
        
        if (head.next == null) {
            return;
        }

        ListNode leftMiddle = middle(head);

        ListNode head2 = leftMiddle.next;

        leftMiddle.next = null;

        head2 = reverse(head2);

        ListNode dummy = new ListNode(-1);
        
        ListNode temp = dummy;

        while (head != null && head2 != null) {

            temp.next = head;
            
            head = head.next;
            
            temp = temp.next;

            temp.next = head2;
            
            head2 = head2.next;
            
            temp = temp.next;

        }
        
        if(head == null){
            
            temp.next = head2;
            
        }
        
        if(head2 == null){
            
            temp.next = head;
            
        }
        
        head = dummy.next;

    }
     public ListNode reverse(ListNode head) {
         
        if (head == null || head.next == null) {
            
            return head;
            
        }
         
        ListNode prev = null;
         
        ListNode curr = head;
         
        ListNode next = head;
         
        while (next != null) {
            
            next = next.next;
            
            curr.next = prev;
            
            prev = curr;
            
            curr = next;
        }
         
        return prev;
         
    }
    
     public ListNode middle(ListNode head) {
         
//        finding left middle of the linked list
         
        ListNode slow = head;
         
        ListNode fast = head;
         
        while (fast.next != null && fast.next.next != null) {
            
            slow = slow.next;
            
            fast = fast.next.next;
            
        }
         
        return slow;
         

    }
}