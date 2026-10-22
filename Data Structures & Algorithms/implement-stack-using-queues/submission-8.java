class MyStack {
    Queue<Integer> s1;
    Queue<Integer> s2;

    public MyStack() {
        this.s1 = new LinkedList<>();
        this.s2 = new LinkedList<>();
        
    }
    
    public void push(int x) {
        s2.offer(x);
        while(!s1.isEmpty()){
            s2.offer(s1.poll());

        }
        Queue<Integer> temp =s1;
        s1 = s2;
        s2 = temp;

        
    }
    
    public int pop() {
        return s1.poll();
    }
    
    public int top() {
        return s1.peek();
    }
    
    public boolean empty() {
        return s1.isEmpty();
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