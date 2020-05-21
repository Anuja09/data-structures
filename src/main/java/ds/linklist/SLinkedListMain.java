package main.java.ds.linklist;

public class SLinkedListMain {
    public static void main(String[] args) {
        Node node1 = new Node(10);
        SLinkedList linkedList = new SLinkedList(node1);
        linkedList.create(20, 30);
        linkedList.print();

        linkedList.insertAtBeginning(40);
        linkedList.print();

        linkedList.insertAtEnd(50);
        linkedList.print();

        linkedList.insertBeforeNode(10, 60);
        linkedList.print();

        linkedList.insertAfterNode(20,70);
        linkedList.print();

        linkedList.findMiddleNode();
        linkedList.deleteAtBegining();
        linkedList.print();

        linkedList.findMiddleNode();

        System.out.println("Occurrences of 70  = " + linkedList.occurrences(linkedList.head(), 70));
        System.out.println("Occurrences of 170 = " + linkedList.occurrences(linkedList.head(), 170));

        linkedList.deleteAtEnd();
        linkedList.print();

        linkedList.deleteByIndex(3);
        linkedList.print();

        linkedList.deleteByData(10);
        linkedList.print();

        linkedList.getNthElement(3);
        linkedList.getNthElementFromEnd(3);

        linkedList.search(linkedList.head(), 70);

        linkedList.findMiddleNode();
        int length = linkedList.length();

        linkedList.print();
        System.out.println("Is Cirle present in list = " + linkedList.isCirclePresent());

        //Create linked list with circle
        Node node2 = new Node(20);
        Node node3 = new Node(30);
        Node node4 = new Node(40);
        Node node5 = new Node(50);
        Node node6 = new Node(60);
        Node node7 = new Node(70);
        node2.next = node3;
        node3.next = node4;
        node4.next = node5;
        node5.next = node6;
        node6.next = node7;
        node7.next = node4;
        SLinkedList linkedList1 = new SLinkedList(node2);
        System.out.println("Is Circle present in list = " + linkedList1.isCirclePresent());

        linkedList1.removeCircle();
        System.out.println("Is Circle present in list = " + linkedList1.isCirclePresent());
        linkedList1.print();
    }
}
