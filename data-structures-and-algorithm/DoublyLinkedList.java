public class DoublyLinkedList<T> {
    Node head;
    Node tail;

    private class Node {
        T data; 
        Node next, prev;

        Node(T data) {
            this.data = data;
        }
    }
    
    void insert(int position, T data) {
        Node prev = null;
        Node curr = this.head;
        int currentPosition = 0;
        while (curr != null && currentPosition < position) {
            currentPosition++;
            prev = curr;
            curr = curr.next;
        }
        Node newNode = new Node(data);
        // "" Situation
        if (curr == null && prev == null) {
            this.head = newNode;
            this.tail = newNode;
        // "B" A Situation
        } else if (prev == null) {
            this.head = newNode;
            newNode.next = curr;
            curr.prev = newNode;
        // A "B" Situation
        } else if (curr == null) {
            this.tail = newNode;
            prev.next = newNode;
            newNode.prev = prev;
        // A "B" C Situation
        } else {
            prev.next = newNode;
            newNode.prev = prev;
            newNode.next = curr;
            curr.prev = newNode;
        }
    }

    void insertFirst(T data) {
        Node newHead = new Node(data);
        newHead.next = this.head;
        if (this.head == null) {
            this.tail = newHead;
        } else {       
            this.head.prev = newHead;
        }
        this.head = newHead;
    }

    void insertLast(T data) {
        if (this.tail == null) {
            this.head = new Node(data);
            this.tail = this.head;
        } else {
            Node newTail = new Node(data);
            this.tail.next = newTail;
            newTail.prev = this.tail;
            this.tail = newTail;
        }
    }
        
    void delete(int position) {
        Node before = null;
        Node after = this.head;
        int currentPosition = 0;
        while (after != null && currentPosition < position) {
            currentPosition++;
            before = after;
            after = after.next;
        }
        if (before == null) {
            head = after.next;
        } else if (after != null) {
            before.next = after.next;
        }
    }

    void deleteFirst() {
        if (this.head != null) {
            head = head.next;
        }
    }

    void deleteLast() {
        Node before = null;
        Node after = this.head;
        if (after != null) {       
            while (after.next != null) {
                before = after;
                after = after.next;
            }
            if (before == null) {
                head = null;
            } else {
                before.next = null;
            }
        }
    }

    void display() {
        Node currentNode = this.head;
        System.out.print("[");
        while (currentNode != null) {
            System.out.print(currentNode.data);
            if (currentNode.next != null) {
                System.out.print(", ");
            }
            currentNode = currentNode.next;
        }
        System.out.print("]\n");
    }

    int index(T data) {
        Node currentNode = this.head;
        int position = 0;
        while (currentNode != null) {
            if (currentNode.data == data) {
                return position;
            }
            currentNode = currentNode.next;
        }
        return -1;
    }

    T search(int position) {
        Node currentNode = this.head;
        int currentPosition = 0;
        while (currentNode != null && currentPosition < position)  {
            currentNode = currentNode.next;
            currentPosition++;
        }
        return (currentNode !=null)?currentNode.data:null;
    }

    void reverse() {
        Node before = null;
        Node after = this.head;
        while (after != null) {
            Node next = after.next;
            after.next = before;
            before = after;
            after = next;
        }
        head = before;
    }
    
    public static void main(String[] args) {
        DoublyLinkedList<String> myIntegerLinkedList = new DoublyLinkedList<String>(); 
        myIntegerLinkedList.insertFirst("A");
        myIntegerLinkedList.insertLast("D");
        myIntegerLinkedList.insert(1, "C");
        myIntegerLinkedList.insert(1, "B");
        myIntegerLinkedList.display();
    }
}