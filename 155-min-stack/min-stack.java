class MinStack {
    Stack<Integer> s;
    Stack<Integer> m;

    public MinStack() {
        s = new Stack<>();
        m = new Stack<>();
    }
    
    public void push(int value) {
        s.push(value);
        if(!m.isEmpty())
            m.push(Math.min(value, m.peek()));
        else m.push(value);
    }
    
    public void pop() {
        if(s.isEmpty()) return;
        s.pop();
        m.pop();
    }
    
    public int top() {
        return s.peek();
    }
    
    public int getMin() {
        return m.peek();
    }
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(value);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */