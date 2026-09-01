class MinStack {
public:
std::vector<int> arr;
std::vector<int> arr2;
        
    MinStack() {
        
    }
    
    void push(int val) {
        arr.push_back(val);
        if(arr2.size() > 0){
            val = min(arr2[ arr2.size()-1] ,val );
            arr2.push_back(val);
        }else{
            arr2.push_back(val);
        }
        
        
    }
    
    void pop() {
        arr.pop_back();
        arr2.pop_back();
    }
    
    int top() {
        return arr[arr.size()-1];
    }
    
    int getMin() {
        return arr2[arr2.size()-1];
        
    }
};
