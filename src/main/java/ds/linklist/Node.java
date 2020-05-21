package main.java.ds.linklist;

public class Node {
    int data;
    Node next;

    public Node(int data) {
        this.data = data;
        this.next = null;
    }

    public int data() {
        return this.data;
    }

    public Node next() {
        return this.next;
    }
}
