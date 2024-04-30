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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        
        if(l1 == null){
            return l2;
        }
        else if(l2 == null){
            return l1;
        }
        
        ListNode result = new ListNode(0);
        ListNode ans = result;
        
        int caryy = 0;
    
        while(l1 != null || l2 != null){
            
            int sum = 0;
            sum = sum + caryy;
            
            if(l1 != null){
                sum+=l1.val;
                l1 = l1.next;
            }
            
            if(l2 != null){
                sum+= l2.val;
                l2 = l2.next;
            }
            
            caryy = sum / 10;
            sum = sum %10;
            ans.next = new ListNode(sum);
            ans = ans.next;
            
        }
        if(caryy > 0){
            ans.next = new ListNode(caryy);
        }
        
        return result.next;
        
        
    }
}