class ListNode:
    def __init__(self,val):
        self.val = val
        self.next = None
class MyLinkedList:

    def __init__(self):
        self.head = ListNode(0)
        self.size =0


    def get(self, index: int) -> int:
        if index < 0 or index > self.size-1:
            return -1
        else:
            node = self.head.next
            while index >0:
                node = node.next 
                index -= 1
            return node.val

        

    def addAtHead(self, val: int) -> None:
        self.addAtIndex(0,val)      

    def addAtTail(self, val: int) -> None:
        self.addAtIndex(self.size, val)

    def addAtIndex(self, index: int, val: int) -> None:
        if index >= 0 and index <= self.size:
            node = self.head
            while index >0:
                node = node.next 
                index -= 1
            newNode = ListNode(val)
            newNode.next = node.next
            node.next = newNode
            self.size += 1

        

    def deleteAtIndex(self, index: int) -> None:
        if index >= 0 and index <self.size:
            node = self.head
            while index >0:
                node = node.next 
                index -= 1
            node.next = node.next.next
            self.size -=1
            
            
            
            

        


# Your MyLinkedList object will be instantiated and called as such:
# obj = MyLinkedList()
# param_1 = obj.get(index)
# obj.addAtHead(val)
# obj.addAtTail(val)
# obj.addAtIndex(index,val)
# obj.deleteAtIndex(index)