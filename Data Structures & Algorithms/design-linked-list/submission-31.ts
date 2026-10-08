class ListNode {
    val
    next
    prev
    constructor(val){
        this.val =val
    }
}

class MyLinkedList {
    head = new ListNode(0)
    tail = new ListNode(0)
    size = 0

    constructor() {
        this.head.next = this.tail
        this.tail.prev = this.head
    }

    /**
     * @param {number} index
     * @return {number}
     */
    get(index: number): number {
        if (index < 0 || index >this.size-1){
            return -1
        }else{
            let node = this.head.next
            while(index >0){
                node = node.next
                --index 
            }
            return node.val
        }
    }

    /**
     * @param {number} val
     * @return {void}
     */
    addAtHead(val: number): void {
        this.addAtIndex(0,val)
    }

    /**
     * @param {number} val
     * @return {void}
     */
    addAtTail(val: number): void {
        this.addAtIndex(this.size,val)
    }

    /**
     * @param {number} index
     * @param {number} val
     * @return {void}
     */
    addAtIndex(index: number, val: number): void {
        if (index >= 0 && index <= this.size){
            let node = this.head.next
            while(index >0){
                node = node.next
                --index 
            }
            let newnode = new ListNode(val)
            newnode.next = node
            newnode.prev = node.prev
            node.prev.next = newnode
            node.prev = newnode
            this.size++
        }
    }

    /**
     * @param {number} index
     * @return {void}
     */
    deleteAtIndex(index: number): void {
        if (index >= 0 && index < this.size){
            let node = this.head.next
            while(index >0){
                node = node.next
                --index 
            }
            node.prev.next = node.next
            node.next.prev = node.prev
            --this.size
    }
}
}

/**
 * Your MyLinkedList object will be instantiated and called as such:
 * var obj = new MyLinkedList()
 * var param_1 = obj.get(index)
 * obj.addAtHead(val)
 * obj.addAtTail(val)
 * obj.addAtIndex(index,val)
 * obj.deleteAtIndex(index)
 */
