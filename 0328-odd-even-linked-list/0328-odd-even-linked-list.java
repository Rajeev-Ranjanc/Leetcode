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
    public ListNode oddEvenList(ListNode head) {
/*
            To solve this i have defined two head nodes one is for the odd numbers and other is for the even        numbers  and declare two odd and even variables to traverse the linked list. one itt var is also declared       to count the indexes like odd or even and if itt is even then added that node into even numbers otherwise       into odd
    inked list and till we came up creating two linked list, and finally I linked even linked list with odd         list,  and we connect head with next part of even head(evenDummy)

     */
        ListNode oddDummy = new ListNode(-1);
        
        ListNode evenDummy = new ListNode(-1);
        
        ListNode odd = oddDummy;
        
        ListNode even = evenDummy;
        
        int itt = 0;
        
        ListNode temp = head;

        while (temp != null) {

            if (itt % 2 == 0) {

                even.next = temp;
                
                even = even.next;

            } else {

                odd.next = temp;
                
                odd = odd.next;

            }

            temp = temp.next;
            
            itt++;

        }

        //for odd numbers before
//        even.next = null;
//        odd.next = evenDummy.next;
//        head = oddDummy.next;

//        print(head);
//
        //for even numver before

        odd.next = null;
        
        even.next = oddDummy.next;
        
        head = evenDummy.next;
        
        return head;
        
    }
}