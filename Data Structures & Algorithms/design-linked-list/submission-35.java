class ListNode{
    ListNode next;
    ListNode prev;
    int val ;
    public ListNode(int val){
        this.val = val;
        this.next = null;
        this.prev = null;
    }
}
class MyLinkedList {
    private ListNode head = new ListNode(0);
    private ListNode tail =new ListNode(0);
    int size;
    public MyLinkedList() {
        this.head.next = this.tail;
        this.tail.prev = this.head;
        this.size = 0;  
    }
    
    public int get(int index) {
        if (index <0 || index > size){
            return -1;
        }else{
            ListNode node = head.next;
            while(node != null){
                node = node.next;
            }
            return node.val;
        }
    }
    
    public void addAtHead(int val) {
        addAtIndex(0,val);
        
    }
    
    public void addAtTail(int val) {
        addAtIndex(size,val);
    }
    
    public void addAtIndex(int index, int val) {
        if (index >= 0 && index <= size){
           ListNode node = head.next;
            while(node != null){
                node = node.next;
            }
            ListNode newnode = new ListNode(val);
            newnode.next = node;
            newnode.prev = node.prev ;
            node.prev.next = newnode;
            node.prev = newnode;
            ++size;
        }
    }
    
    public void deleteAtIndex(int index) {
        if (index >= 0 && index < size){
           ListNode node = head.next;
            while(node != null){
                node = node.next;
            }
        node.next.prev = node.prev;
        node.prev.next = node.next;
        ++size;
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