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