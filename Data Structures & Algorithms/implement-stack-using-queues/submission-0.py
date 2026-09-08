class MyStack:

    def __init__(self):
        self.k1 = deque()

    def push(self, x: int) -> None:
        self.k1.append(x)   

    def pop(self) -> int:
        n = self.k1.pop()
        return n

    def top(self) -> int:
        n = self.k1[-1]
        return n
        

    def empty(self) -> bool:
        return False if bool(self.k1) else True
        


# Your MyStack object will be instantiated and called as such:
# obj = MyStack()
# obj.push(x)
# param_2 = obj.pop()
# param_3 = obj.top()
# param_4 = obj.empty()