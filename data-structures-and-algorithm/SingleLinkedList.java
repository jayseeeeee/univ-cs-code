public class SingleLinkedList<T> {
    Node head;

    private class Node {
        T data; 
        Node next;

        Node(T data) {
            this.data = data;
        }
    }
    
    void insert(int position, T data) {
        Node before = null;
        Node after = this.head;
        int currentPosition = 0;
        while (after != null && currentPosition < position) {
            currentPosition++;
            before = after;
            after = after.next;
        }
        Node newNode = new Node(data);
        newNode.next = after;
        if (before == null) {
            head = newNode;
        } else {
            before.next = newNode;
        }
    }

    void insertFirst(T data) {
        Node newHead = new Node(data);
        newHead.next = head;
        head = newHead;
    }

    void insertLast(T data) {
        Node currentNode = this.head;
        if (currentNode == null) {
            this.head = new Node(data);
        } else {
            while (currentNode.next != null) {
                currentNode = currentNode.next;
            }
            currentNode.next = new Node(data);
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
        SingleLinkedList<String> myIntegerLinkedList = new SingleLinkedList<String>(); 
        myIntegerLinkedList.insertFirst("A");
        myIntegerLinkedList.insert(1, "B");
        myIntegerLinkedList.insertLast("C");
        myIntegerLinkedList.display();
        myIntegerLinkedList.reverse();
        myIntegerLinkedList.display();
    }
}