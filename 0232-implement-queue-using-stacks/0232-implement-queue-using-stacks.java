class MyQueue {
    
/*
 
Google Asked question

This question is asking to implement the queue data structure using stacks not stack it means we
can use multiple stacks like more than 1 stack.

So in this implementation Insertion into stack is taking time O(1) while deletion is taking time O(n)
time to remove an element from queue which is implemented using stacks. to do so first we declare two
stack one is naming first and another is naming second. Adding perform the first stack which is original
simple first.add and done, while at the time of deletion I'm popping all the elements from first stack and
putting those elements into second stack and removed the first(pop) element from second stack and again all
the rest elements we put into the original (first) stack. Peek operation is quite same as the pop operation.
and finally empty operation is nothing just checked the first stack isEmpty? 

One more thing this implementation is for the insertion efficient (TC: O(1)) while deletion taking 
O(N) time.

 */
    
    Stack<Integer> first;
    Stack<Integer> second;
    
    public MyQueue() {
//         Initializing the stack
        first = new Stack<>();
        second = new Stack<>();
    }
    
    public void push(int x) {
//         adding elements into stack (first)
          first.add(x);
    }
    
    public int pop() {
        
//        Copying all the elements into second stack so deletion can be done by like queues
        
        while (!first.isEmpty()) {
            
            second.push(first.pop());
            
        }
        
        int popped = second.pop();
        
//        again put all elements back into original stack
        
        while (!second.isEmpty()) {
            
            first.push(second.pop());
            
        }
        
        return popped;

    }

    
    public int peek() {
        
//      Same as the removing elements from stack but in this just see elements from the stack.we don't remove
//        elements from stack
        
        while (!first.isEmpty()) {
            
            second.add(first.pop());
            
        }
        
//        fetch the top of the element
        
        int peeked = second.peek();
        
        while (!second.isEmpty()) {
            
            first.add(second.pop());
        }

        return peeked;
        
    }
    
    public boolean empty() {
        
        return first.isEmpty();
        
    }
}

/**
 * Your MyQueue object will be instantiated and called as such:
 * MyQueue obj = new MyQueue();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.peek();
 * boolean param_4 = obj.empty();
 */