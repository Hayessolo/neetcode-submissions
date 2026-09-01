# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next

class Solution:
    def reverseList(self, head: Optional[ListNode]) -> Optional[ListNode]:
        prev = None
        cur = head
        next1 = None
        while cur != None:
            next1 = cur.next
            cur.next = prev
            prev = cur
            cur = next1
        head = prev
        return head