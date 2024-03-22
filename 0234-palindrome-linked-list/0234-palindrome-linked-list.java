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
    public boolean isPalindrome(ListNode head) {
        
        int n = length(head);
        int[] nums = new int[n];
        
        //copying elements into the array
        ListNode node = head;
        
        int index = 0;
        
        while(node!= null){
            
            nums[index++] = node.val;
            
            node = node.next;
        }
        
        for(int i=0;i<n/2;i++){
            
            if(nums[i] != nums[n-i-1])
                
                return false;
        }
        
        return true;
          
    }
    
    public int length(ListNode head){
        
        int n = 0;
        
        ListNode node = head;
        
        while(node != null){
            
            n++;
            
            node = node.next;
            
        }
        
        return n;
    }
}