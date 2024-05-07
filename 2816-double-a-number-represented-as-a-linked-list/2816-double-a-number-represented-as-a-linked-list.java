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
     
     /*
        what a felling bro Just Amazing Feels Awesome 
        In this Problem First fo all reversed the Linked list traversed the entire linked list
        using a temporary pointer and while traversing the linked list and I get the data of every node and             multiplied by 2 and
        added carry variable into them which is initialised out of while loop and store a carry into them and           divided that
        variable by 10 and store result into them and keep updating the node value before moving to the next             node and after
        traversing the entire list again reversed them and after that made a single check is carry greater than         0 if yes then
        created the node and append it to the starting of the linked list and simply returned the head pointer
     */
        
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