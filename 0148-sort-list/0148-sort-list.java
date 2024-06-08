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
    public ListNode sortList(ListNode head) {
/*
    Again Nothing fancy! Just applied merge sort and later merge both sorted list.
    First of all find the middle of the linked list for even length take left middle and for odd take
    mid and divided both into list and name first and second and make a recursive call passing first and
    second return value storing into first and second as well now make a call to merge the first and second 
    list and finally returned the ans which is returned by the merge methods

 */
         if (head == null || head.next == null) {
            return head;
        }
        ListNode first = head; // its redundant I can pass this head on this place
        
        ListNode slow = head;
        
        ListNode fast = head;

        while (fast.next != null && fast.next.next != null) {

//            fast.next -> for the odd length of the linked list.
//            fast.next.next -> for even length of the linked list (both are to divide linked list into two parts)
            slow = slow.next;
            fast = fast.next.next;

        }

        ListNode second = slow.next;
        slow.next = null;

//        now I have divided the linked list into two now apply magic(recursion)
        first = sortList(first);
        
        second = sortList(second);

//        now sorted list into two part noe need to merge this
        ListNode ans = merge(first, second);
        
        return ans;
    }
    
    
    
    public ListNode merge(ListNode list1, ListNode list2) {
        
    ListNode dummy = new ListNode(100);
        
        ListNode temp = dummy;

        ListNode temp1 = list1;
        
        ListNode temp2 = list2;
        
        while (temp1 != null && temp2 != null) {
            
            if (temp1.val <= temp2.val) {
                
                temp.next = temp1;
                
                temp1 = temp1.next;

            } else { //
                
                temp.next = temp2;
                
                temp2 = temp2.next;
            }
            
            temp = temp.next;
        }
        
        if (temp1 == null) {
            
            temp.next = temp2;
            
        } else { // temp 2 is null
            
            temp.next = temp1;
            
        }
        
        return dummy.next;
    }
    
}