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
    
 public ListNode reverse(ListNode head) {
        
        if(head == null || head.next == null){
            
            return head;
        }
        
        ListNode prevnode = null;
        ListNode currnode = head;
        ListNode nextnode = head;
        
        while(nextnode != null){
            
            nextnode = nextnode.next;
            
            currnode.next = prevnode;
            
            prevnode = currnode;
            
            currnode = nextnode;
            
        }
        
        head = prevnode;
        return head;
        
        
    }
    
    public ListNode doubleIt(ListNode head) {
        
        head = reverse(head);
        
        ListNode temp = head;
        int carry = 0;
        while (temp != null) {

            int data = temp.val * 2 + carry;
            carry = data / 10;
            data %= 10;

            temp.val = data;
            temp = temp.next;
        }

        head = reverse(head);
        if(carry>0){
            ListNode node = new ListNode(carry);
            node.next = head;
            head = node;
        }
        return head;
        
        
        
    }
}