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
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        /*
            ListNode f = first.head;
        ListNode s = second.head;

        LL ans = new LL();


        while (f != null && s != null) {
            if (f.value < s.value) {
                ans.insertLast(f.value);
                f = f.next;
            } else {
                ans.insertLast(s.value);
                s = s.next;
            }
        }

        while (f != null) {
            ans.insertLast(f.value);
            f = f.next;
        }
        while (s != null) {
            ans.insertLast(s.value);
            s = s.next;
        }
        return ans;
        
        
        simple code just checking which one is greater than the both node 
        */
        ListNode ans = new ListNode();
        
        ListNode dummytail = ans;
        
        while(list1 != null && list2 != null){
            
            if(list1.val<list2.val){
                
                dummytail.next = list1;
                
                list1 = list1.next;
                dummytail = dummytail.next;
            }
            else{
                dummytail.next = list2;
                list2 = list2.next;
                dummytail = dummytail.next;
            }
        }
        
        dummytail.next = (list1 != null) ? list1 : list2;
            
            return ans.next;
    }
}