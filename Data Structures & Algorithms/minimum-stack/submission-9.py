class MinStack:

    def __init__(self):
        self.MinStack = []
        self.Stack =[]

    def push(self, val: int) -> None:
        self.Stack.append(val)
        val = min(val, self.MinStack[-1] if self.MinStack else val)
        self.MinStack.append(val)
        

    def pop(self) -> None:
        self.Stack.pop()
        self.MinStack.pop()

    def top(self) -> int:
        return self.Stack[-1]
        

    def getMin(self) -> int:
        return self.MinStack[-1]
        
