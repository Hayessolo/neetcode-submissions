class ListNode{
    val
    next
    constructor(val){
        this.val = val
        this.next = null
    }
}
class MyLinkedList {
    head
    size
    constructor() {
        this.head = new ListNode(0)
        this.size =0
    }

    /**
     * @param {number} index
     * @return {number}
     */
    get(index: number): number {
        if (index < 0 || index > this.size-1){
            return -1
        }else{
            let node = this.head.next
            while (index >0){
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
        this.addAtIndex(this.size, val)
    }

    /**
     * @param {number} index
     * @param {number} val
     * @return {void}
     */
    addAtIndex(index: number, val: number): void {
        if (index >=0 && index <= this.size){
            let node = this.head
            while (index >0){
                node = node.next
                --index
            }
            let newnode = new ListNode(val)
            newnode.next = node.next
            node.next = newnode
            ++this.size
        }
        }
    

    /**
     * @param {number} index
     * @return {void}
     */
    deleteAtIndex(index: number): void {
        if (index >=0 && index < this.size){
            let node = this.head
            while (index >0){
                node = node.next
                --index
            }
            node.next = node.next.next
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
