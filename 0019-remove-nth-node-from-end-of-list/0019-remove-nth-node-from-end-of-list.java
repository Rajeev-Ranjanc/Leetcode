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
    public ListNode removeNthFromEnd(ListNode head, int n) {
    /*
        this question is done using a lot of brainstorming(mathapachhi) but finally able to solve
        first we find the length of the linked list and later we calculate the node which one is to 
        be remove from end of the linked list by let's say y =  length - x(which node to be remove from 
        the end) of the
        linked list and we runs a while loop until Y does not becomes zero till we traverse using two               pointer one is current and another one is prev once we came out of that loop we simply assign
        prev.next = node.next and if the linked list contains only one node then simply head = head.next
        and return head at that very next line
    
    */
        
        int ln = length(head);
        int nth = ln - n;
        if(nth == 0){
            head = head.next;
            return head;
            
        }
        
        ListNode node = head;
        ListNode prev = null;
        while (nth-->0){
            prev = node;
            node = node.next;
        }
           
            prev.next = node.next;
        
        return head;
    }
    
    
    public int length(ListNode head){
        
         int length = 0;
        ListNode node = head;
        while (node != null) {
            length++;
            node = node.next;
        }
        return length;
    }
    
        
    
}