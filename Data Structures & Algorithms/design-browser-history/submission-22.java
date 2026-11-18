class BrowserHistory {
    List<String> history ;
    int curr;
    public BrowserHistory(String homepage) {
        this.history = new ArrayList<>();
        this.history.add(homepage);
        this.curr =0;

        
    }
    
    public void visit(String url) {
        history = history.subList(0,++curr);
        history.add(url);
    }
    
    public String back(int steps) {
        curr = Math.max(0,curr - steps);
        return history.get(curr);

    }
    
    public String forward(int steps) {
        curr = Math.min(history.size()-1,curr + steps);
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