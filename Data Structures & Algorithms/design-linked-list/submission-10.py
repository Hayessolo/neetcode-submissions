class Node:


    def __init__(self,val =0,next =None) -> None:
        self.val = val
        self.next = next
class MyLinkedList:

    def __init__(self):
        self.head = Node(0)
        self.size = 0

    def get(self, index: int) -> int:
        if index < 0 or index >self.size-1:
            return -1
        else:
            curr = self.head.next
            for _ in range(index):
                curr = curr.next
            return curr.val
        

    def addAtHead(self, val: int) -> None:
        self.addAtIndex(0,val)
        

    def addAtTail(self, val: int) -> None:
        self.addAtIndex(self.size,val)
        

    def addAtIndex(self, index: int, val: int) -> None:
        if index >= 0 or index <= self.size:
            prev =  Node()
            prev.val = val
            curr = self.head
            for _ in range(index):
                curr = curr.next
            prev.next = curr.next
            curr.next = prev
            self.size += 1
            


    def deleteAtIndex(self, index: int) -> None:
        if index >= 0 and index < self.size:
            curr = self.head
            for _ in range(index):
                curr = curr.next
            
            curr.next = curr.next.next
            self.size -=1
            

        


# Your MyLinkedList object will be instantiated and called as such:
# obj = MyLinkedList()
# param_1 = obj.get(index)
# obj.addAtHead(val)
# obj.addAtTail(val)
# obj.addAtIndex(index,val)
# obj.deleteAtIndex(index)