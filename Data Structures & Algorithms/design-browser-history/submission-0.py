class BrowserHistory:
    B = []

    def __init__(self, homepage: str):
        self.B.append(homepage)
        self.curr = 0

    def visit(self, url: str) -> None:
        self.B.append(url)
        self.curr += 1

    def back(self, steps: int) -> str:
        if steps >= len(self.B):
            return self.B[0]
        self.curr -= steps
        return self.B[self.curr]
        

    def forward(self, steps: int) -> str:
        if steps + self.curr >= len(self.B):
            return self.B[len(self.B)-1]
        
        self.curr += steps
        return self.B[self.curr]
        


# Your BrowserHistory object will be instantiated and called as such:
# obj = BrowserHistory(homepage)
# obj.visit(url)
# param_2 = obj.back(steps)
# param_3 = obj.forward(steps)