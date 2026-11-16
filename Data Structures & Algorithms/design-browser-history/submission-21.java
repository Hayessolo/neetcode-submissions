class BrowserHistory {
    ArrayList<Integer> history ;
    int curr;
    public BrowserHistory(String homepage) {
        this.history = new ArrayList();
        this.history.add(homepage);
        this.curr =0;

        
    }
    
    public void visit(String url) {
        history = history.subList(0,curr++);
    }
    
    public String back(int steps) {
        
    }
    
    public String forward(int steps) {
        
    }
}

/**
 * Your BrowserHistory object will be instantiated and called as such:
 * BrowserHistory obj = new BrowserHistory(homepage);
 * obj.visit(url);
 * String param_2 = obj.back(steps);
 * String param_3 = obj.forward(steps);
 */