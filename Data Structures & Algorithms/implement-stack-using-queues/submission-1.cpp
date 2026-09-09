class MyStack {
public:
    queue<int> k1;
    queue<int> k2;

    MyStack() {
        
    }
    
    void push(int x) {
        k1.push(x);
    }
    
    int pop() {
        int k = k1.back();
        int n = k1.size();
        int c = n-1;
        while(c > 0){
            k2.push(k1.front());
            k1.pop();
            c -= 1;
        }
        k1.pop();
        while(!k2.empty()){
            k1.push(k2.front());
            k2.pop();
        }

        
        return k;
        
    }
    
    int top() {
        return k1.back();
        

    }
    
    bool empty() {
        return k1.empty();
        
    }
};

/**
 * Your MyStack object will be instantiated and called as such:
 * MyStack* obj = new MyStack();
 * obj->push(x);
 * int param_2 = obj->pop();
 * int param_3 = obj->top();
 * bool param_4 = obj->empty();
 */