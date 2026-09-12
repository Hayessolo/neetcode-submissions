class Node {
    val: number;
    next: Node;
    constructor(val: number = 0, next: Node = null) {
        this.val = val;
        this.next = next;
    }
}
class MyLinkedList {
    head: Node;
    size: number = 0;
    constructor() {
        this.head = new Node(0, null);
        this.size = 0;
    }

    /**
     * @param {number} index
     * @return {number}
     */
    get(index: number): number {
        if (index < 0 || index >= this.size) {
            return -1;
        }
        let curr: Node = this.head.next;
        let i: number = 0;
        while (i < index) {
            curr = curr.next;
            i += 1
        }
        return curr.val

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
        if (index < 0 || index > this.size) {
            return;
        }
        let prev :Node = this.head
        let i :number= 0
        while(i < index){
            prev = prev.next
            i += 1
        }
        let n :Node= new Node(val,prev.next)
        prev.next = n
        this.size +=1
    }

    /**
     * @param {number} index
     * @return {void}
     */
    deleteAtIndex(index: number): void {
        if (index < 0 || index >= this.size) {
            return;
        }
        let prev :Node = this.head
        let i :number= 0
        while(i < index){
            prev = prev.next
            i += 1
        }
        prev.next = prev.next.next
        this.size -= 1
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
