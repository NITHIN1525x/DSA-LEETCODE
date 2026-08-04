class StockSpanner {
    Stack<Integer> stack = new Stack<>();
    ArrayList<Integer> prices = new ArrayList<>();
    public StockSpanner() {
        stack = new Stack<>();
        prices = new ArrayList<>();
    }
    
    public int next(int price) {
        prices.add(price);
        int i = prices.size() - 1;
        while(!stack.isEmpty() && prices.get(stack.peek()) <= price)
        {
            stack.pop();
        }
        int span;
        if(stack.isEmpty())
        {
            span = i + 1;
        }
        else
        {
            span = i - stack.peek();
        }
        stack.push(i);
        return span;

    }
}

/**
 * Your StockSpanner object will be instantiated and called as such:
 * StockSpanner obj = new StockSpanner();
 * int param_1 = obj.next(price);
 */