class ListNode{
    int val;
    ListNode next;
    public ListNode(int val){
        this.val = val;
        this.next = null;

    }
}
class MyLinkedList {
    ListNode head;
    ListNode tail;
    int size;

    public MyLinkedList() {
        this.head = new ListNode(0);
        this.tail = new ListNode(0);
        this.size =0;
        this.head.next = this.tail;
        
    }
    
    public int get(int index) {
        if(index < 0 || index >size-1){
            return -1;
        }else{
            ListNode node = head.next;
            while(index>0){
                node = node.next ;
                --index;
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
        if (index>=0 && index <=size){
            ListNode node = head;
            while(index>0){
                node = node.next ;
                --index;
            }
            ListNode newnode = new ListNode(val);
            newnode.next = node.next ;
            node.next = newnode;
            size++;
        }
    }
    
    public void deleteAtIndex(int index) {
        if (index>=0 && index <size){
            ListNode node = head;
            while(index>0){
                node = node.next ;
                --index;
            }
            node.next = node.next.next;
            --size;
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