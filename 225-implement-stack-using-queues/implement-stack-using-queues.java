class MyStack {

    Queue<Integer> first;
    Queue<Integer> second;

    public MyStack() {
        first = new ArrayDeque<>();
        second = new ArrayDeque<>();
    }
    
    public void push(int x) {
        if(first.isEmpty()) first.offer(x);
        else {
            while(!first.isEmpty())
                second.offer(first.poll());
            first.offer(x);
            while(!second.isEmpty())
                first.offer(second.poll());
        }
    }
    
    public int pop() {
        return first.poll();
    }
    
    public int top() {
        return first.peek();
    }
    
    public boolean empty() {
        return first.isEmpty();
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