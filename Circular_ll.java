public class Circular_ll {
    Node head, tail;

    public void createList() {
        this.head = new Node(10, tail);
        this.head.next = new Node(20, tail);
        this.head.next.next = new Node(30, tail);
        this.tail = this.head;
    }

    public void display() {
        // System.out.println(this.head.data + " " + this.head.next.data + " " + this.head.next.next.data);
        Node temp = this.head;
        while (temp.next != head) {
        System.out.print(temp.data + " ");
        temp = temp.next;
        }
    }
}

class Node {
    int data;
    Node next;

    Node(int data, Node node) {
        this.data = data;
        this.next = node;
    }
}
