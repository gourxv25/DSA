class MyQueue {

    Stack<Integer> s;
    Stack<Integer> m;
    public MyQueue() {
        s = new Stack<>();
        m = new Stack<>();
    }
    
    public void push(int x) {
        if(s.isEmpty()) s.push(x);
        else {
            while(!s.isEmpty())
                m.push(s.pop());
            s.push(x);
            while(!m.isEmpty())
                s.push(m.pop());
        }
    }
    
    public int pop() {
        return s.pop();
    }
    
    public int peek() {
        return s.peek();
    }
    
    public boolean empty() {
        return s.isEmpty();
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