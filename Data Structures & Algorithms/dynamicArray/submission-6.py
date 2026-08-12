class DynamicArray:
    
    def __init__(self, capacity: int):
        self.capacity = capacity 
        self.size = 0
        self.arr = [0] * capacity


    def get(self, i: int) -> int:
        return self.arr[i]


    def set(self, i: int, n: int) -> None:
        self.arr[i] = n
       

    def pushback(self, n: int) -> None:
        if(self.size == self.capacity):
            self.resize()
        self.arr[self.size] = n
        self.size += 1



    def popback(self) -> int:
        self.size -= 1
        return self.arr[self.size]
 

    def resize(self) -> None:
        newarr = [0]*(self.capacity*2)
        self.capacity *= 2
        i = 0
        for val in self.arr:
            newarr[i] = val
            i += 1
        self.arr =  newarr



    def getSize(self) -> int:
        return self.size
        
    
    def getCapacity(self) -> int:
        return self.capacity
