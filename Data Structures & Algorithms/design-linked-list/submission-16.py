class ListNode :
    def __init__(self,val):
        self.val = val
        self.next = None
        self.prev = None
        
class MyLinkedList:

    def __init__(self):
        self.head = ListNode(0)
        self.tail = ListNode(0)
        self.head.next = self.tail
        self.tail.prev = self.head
        self.size = 0
        
        
    def get(self, index: int) -> int:
        if index <0 or index > self.size-1:
            return -1
        else:
            node = self.head.next
            for _ in range(index):
                node = node.next
                index -= 1
            return node.val
        

    def addAtHead(self, val: int) -> None:
        node = ListNode(val)
        node.next = self.head.next
        node.prev = self.head
        self.head.next.prev  = node
        self.head.next = node
        self.size += 1
        
        

    def addAtTail(self, val: int) -> None:
        node = ListNode(val)
        node.next = self.tail
        node.prev = self.tail.prev
        self.tail.prev.next  = node
        self.tail.prev = node
        self.size +=1
        

    def addAtIndex(self, index: int, val: int) -> None:
        if index >= 0 and index <= self.size-1:
            node = self.head.next
            for _ in range(index):
                node = node.next
                index -= 1
            newnode = ListNode(val)
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
                index -= 1
            node.prev = node.next.next.prev
            node.next = node.next.next
            self.size -= 1
        


# Your MyLinkedList object will be instantiated and called as such:
# obj = MyLinkedList()
# param_1 = obj.get(index)
# obj.addAtHead(val)
# obj.addAtTail(val)
# obj.addAtIndex(index,val)
# obj.deleteAtIndex(index)