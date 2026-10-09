class BrowserHistory {
    List<String> history =new LinkedList<>();
    int curr = 0;

    public BrowserHistory(String homepage) {
        this.history.addLast(homepage);
        
    }
    
    public void visit(String url) {
        while (curr < history.size()-1){
            history.removeLast();
        }
        history.add(url);
        curr++;

        
    }
    
    public String back(int steps) {
        curr = Math.max(curr-steps,0);
        return history.get(curr);
        
    }
    
    public String forward(int steps) {
        curr = Math.min(curr+ steps,history.size()-1);
        return history.get(curr);
        
    }
}

/**
 * Your BrowserHistory object will be instantiated and called as such:
 * BrowserHistory obj = new BrowserHistory(homepage);
 * obj.visit(url);
 * String param_2 = obj.back(steps);
 * String param_3 = obj.forward(steps);
 */