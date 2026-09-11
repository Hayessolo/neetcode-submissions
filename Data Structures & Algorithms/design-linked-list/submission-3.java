class Node {
    public int val;
    public Node next;

    public Node() {
        this.val = 0;
        this.next = null;
    }

    public Node(int val, Node next) {
        this.val = val;
        this.next = next;
    }
}

class MyLinkedList {
    private Node head;
    private int size;

    public MyLinkedList() {
        this.head = new Node(0, null); // Dummy head node at index -1
        this.size = 0;
    }

    public int get(int index) {
        if (index < 0 || index >= size) {
            return -1;
        }

        Node dummy = head.next; // Starts at index 0
        int i = 0;
        while (i < index) {
            dummy = dummy.next;
            i += 1;
        }
        return dummy.val;
    }

    public void addAtHead(int val) {
        addAtIndex(0, val);
    }

    public void addAtTail(int val) {
        addAtIndex(size, val);
    }

    public void addAtIndex(int index, int val) {
        // FIX 1: Allow index == size for appending to tail (use > instead of >=)
        if (index < 0 || index > size) {
            return;
        }

        Node prev = head; // Starts at dummy (index -1)
        int i = 0;
        while (i < index) {
            prev = prev.next;
            i += 1;
        }

        Node n = new Node(val, prev.next);
        prev.next = n;
        size += 1;
    }

    public void deleteAtIndex(int index) {
        // FIX 2: Reject index == size to prevent NullPointerException (use >= instead of >)
        if (index < 0 || index >= size) {
            return;
        }

        Node tobdel = head; // Starts at dummy (index -1)
        int i = 0;
        while (i < index) {
            tobdel = tobdel.next;
            i += 1;
        }

        tobdel.next = tobdel.next.next;
        size -= 1;
    }
}
