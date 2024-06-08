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
    public boolean isPalindrome(ListNode head) {
        
        if(head == null || head.next == null){
            return true;
        }
        
        ListNode slow = head;
        ListNode fast = head;
        
       // Finding the middle of the list
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        ListNode temp = reverse(slow);
        // slow.next = null;

        ListNode first = head;
        ListNode second = temp;
        
//      Comparing both list
        while (second != null) {
            
            if (first.val != second.val) {
                
                return false;
            }
            
            first = first.next;
            second = second.next;

        }
        
        return true;
        
    }
//     reverse linked list
    private ListNode reverse(ListNode head) {
        
        ListNode nextNode = head;
        ListNode currNode = head;
        ListNode prevNode = null;

        while (nextNode != null) {
            nextNode = nextNode.next;
            currNode.next = prevNode;
            prevNode = currNode;
            currNode = nextNode;

        }
       
        return prevNode;
    }
}