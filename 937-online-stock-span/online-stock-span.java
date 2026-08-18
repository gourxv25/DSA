class StockSpanner {

    Stack<Integer> stack;
    ArrayList<Integer> result;
    public StockSpanner() {
        stack = new Stack();
        result = new ArrayList<>();
    }

    public int next(int price) {
        result.add(price);

        int n = result.size();
        int a = result.get(n-1);
        for(int i = n-1; i >= 0;  i--){
            if(a < result.get(i)) return n - i - 1;
        }
        return n;
    }
}

/**
 * Your StockSpanner object will be instantiated and called as such:
 * StockSpanner obj = new StockSpanner();
 * int param_1 = obj.next(price);
 */