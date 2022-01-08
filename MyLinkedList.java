public class MyLinkedList {

    // instance fields for linked_list
    Node head, tail;
    int size = 0;

    public void insertAtFirst(int data) {
        // creating a new Node to be inserted
        Node node = new Node(data);

        // attaching a node to an existing linked_list
        if (size != 0) {
            node.next = head;
            head = node;
            size++;
            return;
        }
        // assigning head & tail refs
        head = node;
        if (size == 0) {
            tail = node;
        }
        size++;
    }

    public void insertAtIndex(int data, int index) {
        if (size < index) {
            return;
        }
        if (index < 0) {
            index = size + index + 1;
        }
        if (index == 0) {
            insertAtFirst(data);
            return;
        }
        if (index == size) {
            insert(data);
            return;
        }
        Node temp = this.head;
        index--;
        while (index-- != 0) {
            temp = temp.next;
        }
        Node node = new Node(data, temp.next);
        temp.next = node;
        size++;
    }

    public void insert(int data) {
        if (this.size == 0) {
            insertAtFirst(data);
            return;
        }
        Node node = new Node(data);
        tail.next = node;
        tail = node;
        size++;
    }

    public Integer removeFirst() {
        if (this.head == null) {
            return null;
        }
        int deleted = head.data;
        head = head.next;
        size--;
        if (size == 0) {
            tail = null;
        }
        return deleted;
    }

    public Integer removeAtIndex(int index) {
        if (index == 0) {
            return removeFirst();
        }
        if (index < 0) {
            index = size + index;
        }
        if (index == size - 1) {
            return remove();
        }
        Node temp = head;
        index--;
        while (index-- != 0) {
            temp = temp.next;
        }
        int deleted = temp.next.data;
        temp.next = temp.next.next;
        size--;
        return deleted;
    }

    public Integer remove() {
        if (size <= 1) {
            return removeFirst();
        }
        int deleted = tail.data;
        Node temp = this.head;
        while (temp.next.next != null) {
            temp = temp.next;
        }
        tail = temp;
        tail.next = null;
        size--;
        return deleted;
    }

    public Integer findMid() {
        int middle = size / 2;
        Node temp = this.head;
        while (middle-- > 0) {
            temp = temp.next;
        }
        return temp.data;
    }

    public void display() {
        if (this.size == 0) {
            System.out.println("Linked List : {}");
            return;
        }
        Node temp = head;
        System.out.print("Linked List : { ");
        while (temp.next != null) {
            System.out.print(temp.data + " , ");
            temp = temp.next;
        }
        System.out.print(temp.data + " }" + "\n");
    }
}

class Node {
    // instance variables for Node obj
    int data;
    Node next;

    Node(int data) {
        this.data = data;
    }

    Node(int data, Node next) {
        this.data = data;
        this.next = next;
    }
}