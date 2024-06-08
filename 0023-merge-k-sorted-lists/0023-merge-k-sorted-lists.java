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
    public ListNode mergeKLists(ListNode[] lists) {
/*
    https://leetcode.com/problems/merge-k-sorted-lists/

    Just declared a queue for easy insertion and deletion purpose rather than array
    and ran a loop while length of queue is greater than the 1 everytime I remove two ListNodes
    from queue and add single listNode by merging both of them & finally return the only element of
    the linked list. & and later all code is of the how to merge two linked list
 */
        if(lists.length == 0){
            return null;
        }
        
        Queue<ListNode> queue = new LinkedList<>();
        
        Collections.addAll(queue, lists);
        
        while (queue.size() > 1) {
            
            ListNode first = queue.remove();
            
            ListNode second = queue.remove();
            
            queue.add(merge(first, second));
        }
        return queue.remove();
        
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