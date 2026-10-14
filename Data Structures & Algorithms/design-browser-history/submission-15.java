class BrowserHistory {
    private List<String> q1;
    private int curr;
    public BrowserHistory(String homepage) {
        this.q1 = new ArrayList<>();
        this.q1.add(homepage);
        this.curr = 0;
    }
    
    public void visit(String url) {
        q1 = q1.subList(0,++curr);
        q1.addLast(url);
    
    }
    
    public String back(int steps) {
        curr = Math.max(0,curr-steps);

        return q1.get(curr);
    }
    
    public String forward(int steps) {
        curr = Math.min(q1.size()-1,curr+steps);
        return q1.get(curr);
    }
}

/**
 * Your BrowserHistory object will be instantiated and called as such:
 * BrowserHistory obj = new BrowserHistory(homepage);
 * obj.visit(url);
 * String param_2 = obj.back(steps);
 * String param_3 = obj.forward(steps);
 */