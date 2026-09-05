class MinStack {
    List<Integer> arr;


    public MinStack() {
        this.arr = new ArrayList<>();
    }
    
    public void push(int val) {
        arr.add(val);
    }
    public void pop() {
        int n = arr.size();
        arr.remove(n-1);
    }
    public int top() {
        int n = arr.size();
        return arr.get(n-1);
    }
    public int getMin() {
        int smallest = top();
        for(int val : arr){
            smallest = Math.min(smallest,val);
        }
        return smallest;
    }
}