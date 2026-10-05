class ListNode{
    
    constructor(val){
        this.val = val
        this.next= null
        this.prev = null
    }
}
class MyLinkedList {
    
    constructor() {
    this.head =new ListNode(0)
    this.tail = new ListNode(0)
    this.head.next = this.tail
    this.tail.prev = this.head
    this.size =0
    }

    /**
     * @param {number} index
     * @return {ListNode}
     */
    getPrev(index) {
        if (index < 0 || index >= this.size){
            return -1

        }else{
            let node = this.head.next;
            while(index > 0){
                node = node.next
                --index
            }
            return node.prev
        }
    }

    /**
     * @param {number} index
     * @return {number}
     */
    get(index) {
        if (index < 0 || index >= this.size){
            return -1

        }else{
            let node = this.head.next;
            while(index > 0){
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
    addAtHead(val){
        let node = new ListNode(val)
        node.next = this.head.next
        node.prev = this.head
        this.head.next.prev = node
        this.head.next = node 
        this.size++
    }

    /**
     * @param {number} val
     * @return {void}
     */
    addAtTail(val) {
        let node = new ListNode(val)
        node.next = this.tail
        node.prev = this.tail.prev
        this.tail.prev.next = node
        this.tail.prev = node
        this.size++
    }

    /**
     * @param {number} index
     * @param {number} val
     * @return {void}
     */
    addAtIndex(index, val) {
        if (index >=0 && index<= this.size){
            let node = this.head.next;
            while(index > 0){
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
    deleteAtIndex(index) {
        if (index >=0 && index<this.size){
            let node = this.head;
            while(index > 0){
                node = node.next
                --index
            }
            node.next.next.prev = node
            node.next = node.next.next
            this.size -=1
            


        }
    }
}
