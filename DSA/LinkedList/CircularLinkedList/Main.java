package CircularLinkedList;
//Singly circular LinkedList
class LinkedList {
    class Node {
        public int data;
        public Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public Node head;
    public Node tail;

    public LinkedList() {
        this.head = null;
        this.tail = null;
    }

    public void insertAtHead(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            newNode.next = newNode;
            tail = newNode;
        } else {
            newNode.next = head;
            tail.next = newNode;
        }
        head = newNode;
    }

    public void insertAtTail(int data) {
        Node newNode = new Node(data);
        if (tail == null) {
            newNode.next = newNode;
            head = newNode;
        } else {
            newNode.next = head;
            tail.next = newNode;
        }
        tail = newNode;
    }

    public void insertAtMiddle(int position, int data) {
        if (position <= 1) {
            insertAtHead(data);
        } else if (position > size()) {
            insertAtTail(data);
        } else {
            Node temp = head;
            int count = 1;
            while (count < position - 1) {
                temp = temp.next;
                count++;
            }
            Node nodeToInsert = new Node(data);
            nodeToInsert.next = temp.next;
            temp.next = nodeToInsert;
        }
    }

    public void deleteNode(int position) {
        if (position == 1) {
            if (head == tail) {
                tail = null;
                head = null;
            } else {
                head = head.next;
                tail.next = head;
            }

        } else {
            Node curr = head;
            Node prev = null;
            int count = 1;
            while (count < position) {
                prev = curr;
                curr = curr.next;
                count++;
            }
            prev.next = curr.next;
            if (curr == tail) {
                tail = prev;
            }

        }
    }

    public int size() {
        if (head == null) {
            return 0;
        }
        int count = 1;
        Node temp = head.next;
        while (temp != head) {
            count++;
            temp = temp.next;
        }
        return count;
    }

    public void display() {
        if (head == null) {
            System.out.println("Linkedlist is empty");
        }
        Node temp = head;
        do {
            System.out.print(temp.data + " ");
            temp = temp.next;
        } while (temp != head);
        System.out.println();
    }

}

public class Main {
    public static void main(String[] args) {
        LinkedList linkedList = new LinkedList();
        linkedList.insertAtHead(10);
        linkedList.display();
        System.out.println("Size of LinkedList is :" + linkedList.size());
        System.out.println("The Head is : " + linkedList.head.data);
        System.out.println("The Tail is : " + linkedList.tail.data);

        linkedList.insertAtHead(20);
        linkedList.display();
        System.out.println("Size of LinkedList is :" + linkedList.size());
        System.out.println("The Head is : " + linkedList.head.data);
        System.out.println("The Tail is : " + linkedList.tail.data);

        linkedList.insertAtHead(30);
        linkedList.display();
        System.out.println("Size of LinkedList is :" + linkedList.size());
        System.out.println("The Head is : " + linkedList.head.data);
        System.out.println("The Tail is : " + linkedList.tail.data);

        linkedList.insertAtHead(40);
        linkedList.display();
        System.out.println("Size of LinkedList is :" + linkedList.size());
        System.out.println("The Head is : " + linkedList.head.data);
        System.out.println("The Tail is : " + linkedList.tail.data);

        linkedList.insertAtHead(50);
        linkedList.display();
        System.out.println("Size of LinkedList is :" + linkedList.size());
        System.out.println("The Head is : " + linkedList.head.data);
        System.out.println("The Tail is : " + linkedList.tail.data);

        linkedList.insertAtTail(10);
        linkedList.display();
        System.out.println("Size of LinkedList is :" + linkedList.size());
        System.out.println("The Head is : " + linkedList.head.data);
        System.out.println("The Tail is : " + linkedList.tail.data);

        linkedList.insertAtTail(20);
        linkedList.display();
        System.out.println("Size of LinkedList is :" + linkedList.size());
        System.out.println("The Head is : " + linkedList.head.data);
        System.out.println("The Tail is : " + linkedList.tail.data);

        linkedList.insertAtTail(30);
        linkedList.display();
        System.out.println("Size of LinkedList is :" + linkedList.size());
        System.out.println("The Head is : " + linkedList.head.data);
        System.out.println("The Tail is : " + linkedList.tail.data);

        linkedList.insertAtTail(40);
        linkedList.display();
        System.out.println("Size of LinkedList is :" + linkedList.size());
        System.out.println("The Head is : " + linkedList.head.data);
        System.out.println("The Tail is : " + linkedList.tail.data);

        linkedList.insertAtMiddle(100, 10);
        linkedList.display();
        System.out.println("Size of LinkedList is :" + linkedList.size());
        System.out.println("The Head is : " + linkedList.head.data);
        System.out.println("The Tail is : " + linkedList.tail.data);

        linkedList.insertAtMiddle(140, 1);
        linkedList.display();
        System.out.println("Size of LinkedList is :" + linkedList.size());
        System.out.println("The Head is : " + linkedList.head.data);
        System.out.println("The Tail is : " + linkedList.tail.data);

        linkedList.insertAtMiddle(1000, 1);
        linkedList.display();
        System.out.println("Size of LinkedList is :" + linkedList.size());
        System.out.println("The Head is : " + linkedList.head.data);
        System.out.println("The Tail is : " + linkedList.tail.data);

        linkedList.insertAtMiddle(400, 5);
        linkedList.display();
        System.out.println("Size of LinkedList is :" + linkedList.size());
        System.out.println("The Head is : " + linkedList.head.data);
        System.out.println("The Tail is : " + linkedList.tail.data);

        linkedList.insertAtMiddle(400, 8);
        linkedList.display();
        System.out.println("Size of LinkedList is :" + linkedList.size());
        System.out.println("The Head is : " + linkedList.head.data);
        System.out.println("The Tail is : " + linkedList.tail.data);

        linkedList.insertAtMiddle(400, 3);
        linkedList.display();
        System.out.println("Size of LinkedList is :" + linkedList.size());
        System.out.println("The Head is : " + linkedList.head.data);
        System.out.println("The Tail is : " + linkedList.tail.data);

        linkedList.deleteNode(1);
        linkedList.display();
        System.out.println("Size of LinkedList is :" + linkedList.size());
        System.out.println("The Head is : " + linkedList.head.data);
        System.out.println("The Tail is : " + linkedList.tail.data);

        linkedList.deleteNode(linkedList.size());
        linkedList.display();
        System.out.println("Size of LinkedList is :" + linkedList.size());
        System.out.println("The Head is : " + linkedList.head.data);
        System.out.println("The Tail is : " + linkedList.tail.data);

        linkedList.deleteNode(6);
        linkedList.display();
        System.out.println("Size of LinkedList is :" + linkedList.size());
        System.out.println("The Head is : " + linkedList.head.data);
        System.out.println("The Tail is : " + linkedList.tail.data);

    }

}