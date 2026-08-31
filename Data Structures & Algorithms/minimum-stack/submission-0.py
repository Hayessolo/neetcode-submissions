class MinStack:

    def __init__(self):
        self.arr = []
        self.arr2 = {}
        self.count = 0

    def push(self, val: int) -> None:
        if self.arr2 :
            if val < self.arr2[self.count] :
                self.count += 1
                self.arr2[self.count] = val 
            else:
                self.arr2[self.count+1] =  self.arr2[self.count]
                self.count += 1  
        else:
            self.arr2[self.count] = val
            
        self.arr.append(val)

    def pop(self) -> None:
        if self.arr2[self.count] == self.arr[-1]:
            del self.arr2[self.count]
            self.count -= 1

        self.arr.pop()
        self.count -= 1
        

    def top(self) -> int:
        top = self.arr[-1]
        return top
        

    def getMin(self) -> int:
        return self.arr2[self.count] 
        
