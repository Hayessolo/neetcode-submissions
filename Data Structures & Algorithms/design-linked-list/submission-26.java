class ListNode{
    int val;
    ListNode next = null;
    ListNode prev = null;
    public ListNode(int val){
        this.val = val;
    }

}
class MyLinkedList {
    int size =0;
    ListNode head = new ListNode(0);
    ListNode tail = new ListNode(0);

    public MyLinkedList() {
        this.head.next = tail;
        this.tail.prev = head;
        this.size = size;

        
    }
    
    public int get(int index) {
        if (index < 0 || index >size-1 ){
            return -1;
        }else{
            ListNode node = head.next;
            while (index >0){
                node = node.next;
                --index;
            }
            return node.val;
        }
        
    }
    
    public void addAtHead(int val) {
        ListNode node = new ListNode(val);
        node.next = head.next;
        node.prev = head;
        head.next.prev = node;
        head.next = node;
        size++;
    }
    
    public void addAtTail(int val) {
        ListNode node = new ListNode(val);
        node.prev = tail.prev;
        node.next = tail;
        tail.prev.next = node;
        tail.prev = node;
        size++;

    }
    
    public void addAtIndex(int index, int val) {
        if (index >= 0 && index <= size ){
            ListNode node = head.next;
            while (index > 0){
                node = node.next;
                --index;
            }
            ListNode newnode = new  ListNode(val);
            newnode.next = node;
            newnode.prev = node.prev;
            node.prev.next = newnode;
            node.prev = newnode;
            size++;
        }

        
    }
    
    public void deleteAtIndex(int index) {

        if(index >= 0 && index <= size-1){
            ListNode node = head;
            while (index > 0 && index < size){
                node = node.next;
                --index;
            }
            node.next.next.prev = node;
            node.next =node.next.next;
        }
        
    }
}

/**
 * Your MyLinkedList object will be instantiated and called as such:
 * MyLinkedList obj = new MyLinkedList();
 * int param_1 = obj.get(index);
 * obj.addAtHead(val);
 * obj.addAtTail(val);
 * obj.addAtIndex(index,val);
 * obj.deleteAtIndex(index);
 */