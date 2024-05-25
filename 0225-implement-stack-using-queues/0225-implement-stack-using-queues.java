class MyStack {

    int[] a;
    int top;
    
    public MyStack() {
  
        a = new int[10];
        
        top = -1;
    }
    
    public void push(int x) {
        
        
        top++;
        a[top] = x;
        
    }
    
    public int pop() {
        
        return a[top--];
    }
    
    public int top() {
        
        return a[top];
        
    }
    
    public boolean empty() {
        
        return top == -1;
        
    }
}

/**
 * Your MyStack object will be instantiated and called as such:
 * MyStack obj = new MyStack();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.top();
 * boolean param_4 = obj.empty();
 */