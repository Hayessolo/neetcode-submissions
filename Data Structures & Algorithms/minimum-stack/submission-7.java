class MinStack {
    Stack<Integer> stack = new Stack<>();
    Stack<Integer> minstack = new Stack<>();

    public MinStack() {
        this.stack = stack;
        this.minstack = minstack;

        
    }
    
    public void push(int val) {
        stack.push(val);
        val = Math.min(val , minstack.size() > 0 ? minstack.peek(): val);
        minstack.push(val);
    }
    
    public void pop() {
        stack.pop();
        minstack.pop();
        
    }
    
    public int top() {
        return stack.peek();
        
    }
    
    public int getMin() {
       return minstack.peek();
        
    }
}
