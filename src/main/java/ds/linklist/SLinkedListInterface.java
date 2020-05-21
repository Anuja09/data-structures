package main.java.ds.linklist;

public interface SLinkedListInterface {
    void create(int... data);
    void print();
    int length();
    boolean isExist(int data);

    void insertAtBeginning(int data);
    void insertAtEnd(int data);
    void insertBeforeNode(int prevNode, int data);
    void insertAfterNode(int nextNode, int data);

    void deleteAtBegining();
    void deleteAtEnd();
    void deleteByIndex(int index);
    void deleteByData(int data);

    int getNthElement(int location);
    int getNthElementFromEnd(int location);

    boolean search(Node node, int data);

    int findMiddleNode();
    int occurrences(Node head, int data);

    boolean isCirclePresent();
    void removeCircle();

}
