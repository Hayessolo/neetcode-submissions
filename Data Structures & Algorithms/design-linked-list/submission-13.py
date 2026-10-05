class NodeList :
    def __init__(self, val:int) -> None:
        self.val = val
        self.next = None
        self.prev =None
class MyLinkedList:

    def __init__(self):
        self.head = NodeList(0)
        self.tail = NodeList(0)
        self.head.next = self.tail
        self.tail.prev = self.head
        self.size = 0

        

    def get(self, index: int) -> int:
        if index < 0 or index >= self.size:
            return -1
        else:
            curr = self.head.next
            for _ in range(index):
                curr = curr.next
            return curr.val
        

    def addAtHead(self, val: int) -> None:
        newhead = NodeList(val)
        newhead.next = self.head.next
        self.head.next.prev = newhead
        newhead.prev = self.head
        self.head.next = newhead
        self.size += 1

        

    def addAtTail(self, val: int) -> None:
        newtail = NodeList(val)
        newtail.prev = self.tail.prev
        self.tail.prev.next = newtail
        newtail.next = self.tail
        self.tail.prev = newtail
        self.size += 1

        

    def addAtIndex(self, index: int, val: int) -> None:
        
        if index >= 0 and index <= self.size:
            node = self.head.next
            for _ in range(index):
                node = node.next
            newnode = NodeList(val)
            newnode.next = node

            newnode.prev = node.prev
            node.prev.next = newnode
            node.prev = newnode
            self.size +=1



        

                
    def deleteAtIndex(self, index: int) -> None:
        if index >= 0 and index < self.size:
            node = self.head
            for _ in range(index):
                node = node.next
            
            node.next.next.prev = node
            node.next = node.next.next
            self.size -=1
            


# Your MyLinkedList object will be instantiated and called as such:
# obj = MyLinkedList()
# param_1 = obj.get(index)
# obj.addAtHead(val)
# obj.addAtTail(val)
# obj.addAtIndex(index,val)
# obj.deleteAtIndex(index)