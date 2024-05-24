/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    
     public int length(ListNode head) {
         
        ListNode temp = head;
         
        int c = 0;
         
        while (temp != null) {
            
            c++;
            temp = temp.next;
            
        }
         
        return c;
         
    }

    
    
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        
        
        
        ListNode tempA = headA;
        ListNode tempB = headB;

        int a = length(tempA);
        int b = length(tempB);

        // System.out.println(a + " " + b);

        if (a != b) {

            if (a > b) {

                while (a != b) {
                    tempA = tempA.next;
                    a--;
                }

            } else {
                while (a != b) {
                    tempB = tempB.next;
                    b--;
                }
            }

        }

        // System.out.println(a + "     " + b);

        while (tempA != null) {
            
            if (tempA == tempB) {
                
                return tempA;
                
            }
            
            tempA = tempA.next;
            tempB = tempB.next;
            
        }

        return null;

        
        
    }
}