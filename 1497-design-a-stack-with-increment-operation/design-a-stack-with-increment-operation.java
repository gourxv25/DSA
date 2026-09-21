class CustomStack {

    int[] arr;
    int  i =-1;
    public CustomStack(int maxSize) {
        arr = new int[maxSize];
    }
    
    public void push(int x) {
        if(i == arr.length - 1) return;
        i++; 
        arr[i] = x; 
    }
    
    public int pop() {
         if(i == -1) return -1;
        return arr[i--];
    }
    
    public void increment(int k, int val) {
        int limit = Math.min(k, i + 1);
        for (int j = 0; j < limit; j++) {
            arr[j] += val;
        }

    }
}

/**
 * Your CustomStack object will be instantiated and called as such:
 * CustomStack obj = new CustomStack(maxSize);
 * obj.push(x);
 * int param_2 = obj.pop();
 * obj.increment(k,val);
 */