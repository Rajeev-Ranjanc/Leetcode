/*
// Definition for a Node.
class Node {
    int val;
    Node next;
    Node random;

    public Node(int val) {
        this.val = val;
        this.next = null;
        this.random = null;
    }
}
*/

class Solution {
    public Node copyRandomList(Node head) {
        
       if (head == null) {
            return null;
        }
         /*

        1. Create a deep copy of given linked list
        2.Join these 2 linked list alternatively
        3. Assign Random Pointers
        4. Split linked list again


     */
        
        // Step 1: Deep copy
        Node head2 = deepCopy(head);

        // Step 2: Connect alternatively
        connectAlternately(head, head2);
        
        // Step 3: Assign random pointer
        assignRandom(head, head2);
        
        // Step 4: Split linked list again
        splitLinkedList(head, head2);

        return head2; // Return the head of the copied list
    }
    
   public void assignRandom(Node head, Node head2) {
        
        Node t1 = head;
        Node t2 = head2;

        while (t1 != null) {
            t2 = t1.next;

            if (t1.random != null) {
                t2.random = t1.random.next;
            }

            t1 = t1.next.next;
        }
    }
    
    public void connectAlternately(Node head, Node head2) {
        Node t1 = head;
        Node t2 = head2;

        while (t1 != null && t2 != null) {
            Node temp1 = t1.next;
            Node temp2 = t2.next;

            t1.next = t2;
            if (temp1 != null) {
                t2.next = temp1;
            }

            t1 = temp1;
            t2 = temp2;
        }
    }
    
    public void splitLinkedList(Node head, Node head2) {
        Node t1 = head;
        Node t2 = head2;

        while (t1 != null && t2 != null) {
            t1.next = t2.next;
            t1 = t1.next;
            if (t1 != null) {
                t2.next = t1.next;
                t2 = t2.next;
            }
        }
    }
    
    private Node deepCopy(Node head) {
        Node head2 = new Node(head.val);
        Node t1 = head.next;
        Node t2 = head2;

        while (t1 != null) {
            Node temp = new Node(t1.val);
            t2.next = temp;
            t2 = t2.next;
            t1 = t1.next;
        }
        return head2;
    }
}