class NodeList {
    int val ;
    NodeList next;
    NodeList prev;
    public NodeList(int val){
        this.val = val;
       
    }
}
class MyLinkedList {
    NodeList head =new NodeList(0);
    NodeList tail =new NodeList(0);
    
    int size = 0;

    public MyLinkedList() {
        this.head = head;
        this.tail = tail;  
        this.size = size; 
        head.next = tail;
        tail.prev = head;
    }
    
    public int get(int index) {
        if (index < 0 || index >= size){
            return -1;
        }else{
            NodeList curr = head.next;
            while(index >0){
                curr = curr.next;
                --index;
            }
            return curr.val;

        }
        
    }
    
    public void addAtHead(int val) {
        NodeList newhead =new NodeList(val);
        newhead.next = head.next;
        
        newhead.prev = head;
        head.next.prev = newhead;
        head.next = newhead ;
        size++;        
    }
    
    public void addAtTail(int val) {
        NodeList newtail = new NodeList(val);
        newtail.prev = tail.prev;
        newtail.next = tail;
        tail.prev.next = newtail;
        tail.prev = newtail ;
        size++; 
        
    }
    
    public void addAtIndex(int index, int val) {
        if (index >= 0&&  index <= size){
            NodeList node =  head.next;
            while(index >0){
                node = node.next;
                --index;
            }
            NodeList newnode = new NodeList(val);
            newnode.next = node;
            newnode.prev =node.prev;
            node.prev.next =newnode;
            node.prev = newnode;
            
            size++; 

        }
        
    }
    
    public void deleteAtIndex(int index) {
        if (index >=0 && index < size){
           NodeList node =  head;
            while(index >0){
                node = node.next;
                --index;
            }
            node.next.next.prev = node;
            node.next = node.next.next;
            size --;
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