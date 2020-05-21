package main.java.ds.linklist;

public class SLinkedList implements SLinkedListInterface {
    private Node head;

    public SLinkedList(Node head) {
        this.head = head;
    }

    public SLinkedList() {
        this.head = null;
    }

    public Node head() {
        return this.head;
    }

    @Override
    public void create(int... data) {
        Node node = head;
        int length = data.length;
        for (int i = 0; i < length; i++) {
            node.next = new Node(data[i]);
            node = node.next;
        }
    }

    @Override
    public void print() {
        Node node = head;
        System.out.print("LinkedList = [ ");
        while (node != null) {
            System.out.print(node.data + " -> ");
            node = node.next;
        }
        System.out.println("null ]");
    }

    @Override
    public int length() {
        Node node = head;
        int len = 0;
        while (node != null) {
            len++;
            node = node.next;
        }
        System.out.println("Length : " + len);
        return len;
    }

    @Override
    public boolean isExist(int data) {
        if (head != null) {
            Node node = head;
            while (node != null && node.data != data) {
                node = node.next;
            }
            if (node != null) {
                return true;
            }
        }
        return false;
    }

    @Override
    public void insertAtBeginning(int data) {
        System.out.println("Insert at beginning");
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            return;
        } else {
            Node node = head;
            head = newNode;
            head.next = node;
        }
    }

    @Override
    public void insertAtEnd(int data) {
        System.out.println("Insert at end");
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            return;
        } else {
            Node node = head;
            while (node.next != null) {
                node = node.next;
            }
            node.next = newNode;
        }
    }

    @Override
    public void insertBeforeNode(int prevNode, int data) {
        System.out.println("Insert before node " + prevNode);
        if (head == null || !isExist(prevNode)) {
            System.out.println("List is empty or PrevNode does not exist");
            return;
        } else {

            Node node = head;
            while (node != null && node.next.data != prevNode) {
                node = node.next;
            }
            Node newNode = new Node(data);
            Node prevList = node;
            newNode.next = prevList.next;
            prevList.next = newNode;
        }
    }

    @Override
    public void insertAfterNode(int nextNode, int data) {
        System.out.println("Insert after node " + nextNode);
        if (head == null || !isExist(nextNode)) {
            System.out.println("List is empty or PrevNode does not exist");
            return;
        } else {
            Node node = head;
            while (node != null && node.data != nextNode) {
                node = node.next;
            }
            Node prevList = node;
            Node newNode = new Node(data);
            newNode.next = prevList.next;
            prevList.next = newNode;
        }
    }

    @Override
    public void deleteAtBegining() {
        System.out.println("Delete At Beginning ");
        if (head == null) {
            System.out.println("LinkedList is empty");
            return;
        }
        Node node = head;
        head = head.next;
    }

    @Override
    public void deleteAtEnd() {
        System.out.println("Delete At End ");
        if (head == null) {
            System.out.println("LinkedList is empty");
            return;
        }
        Node node = head;
        while (node.next.next != null) {
            node = node.next;
        }
        node.next = null;
    }

    @Override
    public void deleteByIndex(int index) {
        System.out.println("Delete At index " + index);
        if (head == null) {
            System.out.println("LinkedList is empty");
            return;
        }
        Node node = head;
        int i = index - 1;
        while (i > 1) {
            node = node.next;
            i--;
        }
        node.next = node.next.next;
    }

    @Override
    public void deleteByData(int data) {
        System.out.println("Delete Node " + data);
        if (head == null) {
            System.out.println("LinkedList is empty");
            return;
        }
        Node node = head;
        while (node != null) {
            if (node.next.data == data) {
                node.next = node.next.next;
                break;
            }
            node = node.next;
        }
    }

    @Override
    public int getNthElement(int location) {
        if (head == null || length() < location) {
            System.out.println("LinkedList is empty or out of index");
            return -1;
        }
        System.out.print("Element at index " + location);
        Node node = head;
        int i = location - 1;
        while (i > 0) {
            node = node.next;
            i--;
        }
        System.out.println(" = " + node.data);
        return node.data;
    }

    @Override
    public int getNthElementFromEnd(int location) {
        int len = length();
        if (head == null || len < location) {
            System.out.println("LinkedList is empty or out of index");
            return -1;
        }
        System.out.print("Element at index " + location + " from end ");
        Node node = head;
        int i = (len - 1) - (location - 1);
        while (i > 0) {
            node = node.next;
            i--;
        }
        System.out.println(" = " + node.data);
        return node.data;
    }

    @Override
    public boolean search(Node head, int data) {
        if (head == null)
            return false;
        if (head.data == data) {
            System.out.println("Element present");
            return true;
        }
        return search(head.next, data);
    }

    @Override
    public int findMiddleNode() {
        if (head == null) {
            System.out.println("LinkedList is empty");
            return -1;
        }
        Node node = head;
        Node slowPtr = head;
        while (node != null && node.next != null) {
            node = node.next.next;
            slowPtr = slowPtr.next;
        }
        System.out.println("Element At middle = " + slowPtr.data);
        return slowPtr.data;
    }

    @Override
    public int occurrences(Node head, int data) {
        if (head == null)
            return 0;
        if (head.data == data) {
            return 1 + occurrences(head.next, data);
        }
        return occurrences(head.next, data);
    }

    @Override
    public boolean isCirclePresent() {
        if (head == null) {
            System.out.println("LinkedList is empty");
            return false;
        }

        Node slow = head;
        Node fast = head;
        boolean isCircle = false;

        while (slow != null && fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            if (slow == fast) {
                isCircle = true;
                break;
            }
        }
        return isCircle;
    }

    @Override
    public void removeCircle() {
        if (head == null) {
            System.out.println("LinkedList is empty");
            return;
        }

        Node slow = head;
        Node fast = head;
        boolean isCircle = false;

        while (slow != null && fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            if (slow == fast) {
                isCircle = true;
                break;
            }
        }
        slow = head;
        while (slow.next != fast.next) {
            slow = slow.next;
            fast = fast.next;
        }
        fast.next = null;
    }
}
