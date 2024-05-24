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
    public ListNode rotateRight(ListNode head, int k) {
 /*
        Logical good question to solve this we declare the two pointer one is slow and other is fast
        and first of all moved fast by kth time ahead in the linked list while slow is at pointing head.
        now runs a while loop till fast.next != null we move slow and fast by only one move. After doing
        this fast will be at the last of the linked list and slow will be at the node from where rotation
        should perform, so I declare a newHead which will be the next part of slow and then slow.next will
        put null, so it can be end part of linked list. and next part of fast will be head, By this our ll
        is rotated. To get understand better way try this in pen and paper
     */
    if (head == null || head.next == null) {
            return head;
        }

        ListNode temp = head;

        int n = 0;
        
        //calculating length of the linked list
        while (temp != null) {
            n++;
            temp = temp.next;
        }
        
        // os k become less than n since 3%4 == 7%4 that's why
        k %= n;
        
        //and if k ==0 means i don't need to rotate the linked list
        if (k == 0) {
            return head;
        }

    

        //Algorithm of rotation
        ListNode slow = head;
        ListNode fast = head;

        ListNode newHead = null;

        for (int i = 1; i <= k; i++) {
            fast = fast.next;
        }

        while (fast.next != null) {

            slow = slow.next;
            fast = fast.next;

        }

        newHead = slow.next;
        slow.next = null;
        fast.next = head;


//        printList(newHead);

        return newHead;

    }
}