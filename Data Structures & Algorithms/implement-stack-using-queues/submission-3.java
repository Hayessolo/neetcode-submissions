class MyStack {
    Deque<Integer> k = new ArrayDeque<>();

    public MyStack() {
        this.k = k;
        
    }
    
    public void push(int x) {
        k.addLast(x);
        
    }
    
    public int pop() {
        return k.removeLast();
        
    }
    
    public int top() {
        return k.peekLast();
    }
     
    public boolean empty() {
        if (k.size() >0){
            return false;
        }else{
            return true;
        }
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