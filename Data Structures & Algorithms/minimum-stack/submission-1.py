class MinStack:

    def __init__(self):
        self.arr = []
        self.arr2 = []
        

    def push(self, val: int) -> None:
        self.arr.append(val)
        if self.arr2:
            least = min(val,self.arr2[-1])
            self.arr2.append(least)
        else:
            self.arr2.append(val)
    def pop(self) -> None:
        self.arr.pop()
        self.arr2.pop()
     
        

    def top(self) -> int:
        top = self.arr[-1]
        return top
        

    def getMin(self) -> int:
        return self.arr2[-1] 
        
