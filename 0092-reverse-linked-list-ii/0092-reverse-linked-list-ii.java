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
    public ListNode reverseBetween(ListNode head, int left, int right) {
        /*
          
            Declared 4 notes and divide the linked list into 3 parts, and reverse the
            parts which is to be reverse and again make the link to make the arrayList
            and check edge cases as well as the list contains only two elements or the left 
            part is starting from 1 and right is the last node of the linked in this case a and 
            d never be updated it will always as it initialised which is null. check such cases
         
        */
         if (head.next == null || left == right) {
            return head;
        }
        int n = 1;

        ListNode temp = head;

        ListNode a = null;
        ListNode b = null;
        ListNode c = null;
        ListNode d = null;

        while (temp != null) {
            if (n == left - 1) {
                a = temp;
            }
            if (n == left) {
                b = temp;
            }
            if (n == right) {
                c = temp;
                d = temp.next;
                break;
            }
            temp = temp.next;
            n++;
        }
        if(a!=null)
            a.next = null;
        if(c!=null)
            c.next = null;
        reverse(b);
        if(a!=null)
            a.next = c;
        b.next = d;

        if(a == null){
            return c;
        }

        return head;
//        I don't need to return head always in case of [3,5] When I will reverse head will point 3 and 5 will not return
//        because left is 1 and right 2 in that a will always be null in that case return C

    }

     private void reverse(ListNode head) {

        if (head == null || head.next == null) {

            return;
        }

        ListNode prevnode = null;
        ListNode currnode = head;
        ListNode nextnode = head;

        while (nextnode != null) {

            nextnode = nextnode.next;

            currnode.next = prevnode;

            prevnode = currnode;

            currnode = nextnode;

        }

        head = prevnode;

    }

}