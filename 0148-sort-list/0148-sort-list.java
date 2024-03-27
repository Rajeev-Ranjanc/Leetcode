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
        
        //prerequisite is we should know about the merge sort first it then complete this
        //when there are only one node or linked list is empty then it is already sorted
          if (head == null || head.next == null) {
            return head;
        }
        
        //merge sort calculations
        ListNode mid = getMid(head);
        ListNode left = sortList(head);
        ListNode right = sortList(mid);

        return merge(left, right);

    }
    
    //code fo merging of two linked list also avaliavle this question on leetcode
    ListNode merge(ListNode list1, ListNode list2) {
        ListNode dummyhead = new ListNode();
        ListNode tail = dummyhead;
        while (list1 != null && list2 != null) {
            if (list1.val < list2.val) {
                tail.next = list1;
                list1 = list1.next;
            } else {
                tail.next = list2;
                list2 = list2.next;
            }
            tail = tail.next;
        }
        tail.next = (list1 != null) ? list1 : list2;
        return dummyhead.next;

    }

    //finding middle of the linekd list
    public ListNode getMid(ListNode head) {
        ListNode midprev = null;
        while (head != null && head.next != null) {
            midprev = (midprev == null) ? head : midprev.next;
            head = head.next.next;
        }

        ListNode mid = midprev.next;
        midprev.next = null;
        return mid;
    }
}