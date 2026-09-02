/**
 * Definition for singly-linked list.
 * class ListNode {
 *     constructor(val = 0, next = null) {
 *         this.val = val;
 *         this.next = next;
 *     }
 * }
 */

class Solution {
    /**
     * @param {ListNode} head
     * @return {ListNode}
     */
    reverseList(head: ListNode | null): ListNode {
        let prev: ListNode = null
        let cur: ListNode = head
        let next: ListNode = null
        while(cur != null){
            next = cur.next
            cur.next = prev
            prev = cur
            cur = next
        }
        head = prev
        return head
    }
}
