class MyLinkedList:
    class Node:
        def __init__(self,val = 0,next =None):
            self.val = val 
            self.next = next

    def __init__(self):
        self.arr:Node = [] 

    def get(self, index: int) -> int:
        if index < len(self.arr) and index >= 0:
            return self.arr[index].val
        else:
            return -1

    def addAtHead(self, val: int) -> None:
        n = self.Node()
        n.val = val
        if len(self.arr) > 0:
            self.arr.append(self.arr[-1])
            for i in range(len(self.arr)-2,-1,-1):
                self.arr[i+1] = self.arr[i]
                if i+1 == len(self.arr)-1:
                    self.arr[i+1].next = None
                else:
                    self.arr[i+1].next = self.arr[i+2]
            self.arr[0] = n
            self.arr[0].next = self.arr[1]
        else:
            self.arr.append(n)
                
            
    def addAtTail(self, val: int) -> None:
        n = self.Node()
        n.val = val
        n.next = None
        if self.arr:
            self.arr[-1].next = n
            self.arr.append(n)
        else:
            self.arr.append(n)
            

        

        

    def addAtIndex(self, index: int, val: int) -> None:
        n = self.Node()
        n.val = val
        if self.arr and index < len(self.arr) and index > 1:
            self.arr.append(self.arr[-1])
           
            for i in range(len(self.arr)-2,index-2,-1):
                self.arr[i+1] = self.arr[i]
                if i+1 == len(self.arr)-1:
                    self.arr[i+1].next = None
                else:
                    self.arr[i+1].next = self.arr[i+2]
            index -= 1
            self.arr[index] = n
            self.arr[index].next = self.arr[index+1]
            self.arr[index-1].next = self.arr[index]
        elif index == len(self.arr):
            self.arr.append(n)
        elif index == 0 or index == 1:
            self.addAtHead(val)


    def deleteAtIndex(self, index: int) -> None:
        if index < len(self.arr) and index > 0:

            for i in range(index,len(self.arr),1):
                self.arr[i] = self.arr[i+1]
                self.arr[i-1].next = self.arr[i]
            self.arr.pop()

        elif index == len(self.arr)-1 and len(self.arr) > 1:
            self.arr.pop()
            self.arr[-1].next = None
        elif len(arr) == 1:
            self.arr.pop()



# Your MyLinkedList object will be instantiated and called as such:
# obj = MyLinkedList()
# param_1 = obj.get(index)
# obj.addAtHead(val)
# obj.addAtTail(val)
# obj.addAtIndex(index,val)
# obj.deleteAtIndex(index)