//LinkedList
class LinkedList {
    public class Node {
        public int data;
        public Node next;

        Node(int data) {
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
        newNode.next = head;
        head = newNode;
        if (tail == null) {
            tail = newNode;

        }

    }

    public void insertAtTail(int data) {
        Node newNode = new Node(data);
        if (tail == null) {
            head = newNode;
            tail = newNode;

        } else {
            tail.next = newNode;
            tail = newNode;
        }

    }

    public void insertAtMiddle(int position, int data) {
        if (position <= 1) {
            insertAtHead(data);

        } else if (position > size()) {
            insertAtTail(data);

        } else {
            Node newNode = new Node(data);

            Node temp = head;
            int count = 1;
            while (count < position - 1) {
                temp = temp.next;
                count++;

            }
            newNode.next = temp.next;
            temp.next = newNode;
        }

    }

    public void delete(int position) {
        if (position == 1) {
            if (tail == head) {
                tail = null;

            }
            head = head.next;

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
        int count = 0;
        Node temp = head;
        while (temp != null) {
            count++;
            temp = temp.next;

        }
        return count;
    }

    public void print() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;

        }
        System.out.println();
    }

}
public class Main {

    public static void main(String[] args) {
        LinkedList linkedList=new LinkedList();
        linkedList.insertAtHead(10);
        System.out.println("Head is : "+ linkedList.head.data);
        System.out.println("Tail is : "+ linkedList.tail.data);
        System.out.println("Size is : "+ linkedList.size());
        linkedList.print();

        linkedList.insertAtHead(20);
        System.out.println("Head is : "+ linkedList.head.data);
        System.out.println("Tail is : "+ linkedList.tail.data);
        System.out.println("Size is : "+ linkedList.size());
        linkedList.print();

        linkedList.insertAtHead(30);
        System.out.println("Head is : "+ linkedList.head.data);
        System.out.println("Tail is : "+ linkedList.tail.data);
        System.out.println("Size is : "+ linkedList.size());
        linkedList.print();

        linkedList.insertAtHead(40);
        System.out.println("Head is : "+ linkedList.head.data);
        System.out.println("Tail is : "+ linkedList.tail.data);
        System.out.println("Size is : "+ linkedList.size());
        linkedList.print();

        linkedList.insertAtTail(40);
        System.out.println("Head is : "+ linkedList.head.data);
        System.out.println("Tail is : "+ linkedList.tail.data);
        System.out.println("Size is : "+ linkedList.size());
        linkedList.print();

        linkedList.insertAtTail(50);
        System.out.println("Head is : "+ linkedList.head.data);
        System.out.println("Tail is : "+ linkedList.tail.data);
        System.out.println("Size is : "+ linkedList.size());
        linkedList.print();

        linkedList.insertAtTail(60);
        System.out.println("Head is : "+ linkedList.head.data);
        System.out.println("Tail is : "+ linkedList.tail.data);
        System.out.println("Size is : "+ linkedList.size());
        linkedList.print();

        linkedList.insertAtTail(70);
        System.out.println("Head is : "+ linkedList.head.data);
        System.out.println("Tail is : "+ linkedList.tail.data);
        System.out.println("Size is : "+ linkedList.size());
        linkedList.print();


        linkedList.insertAtMiddle(1,34);
        System.out.println("Head is : "+ linkedList.head.data);
        System.out.println("Tail is : "+ linkedList.tail.data);
        System.out.println("Size is : "+ linkedList.size());
        linkedList.print();

        linkedList.insertAtMiddle(100,34);
        System.out.println("Head is : "+ linkedList.head.data);
        System.out.println("Tail is : "+ linkedList.tail.data);
        System.out.println("Size is : "+ linkedList.size());
        linkedList.print();

        linkedList.insertAtMiddle(3,100);
        System.out.println("Head is : "+ linkedList.head.data);
        System.out.println("Tail is : "+ linkedList.tail.data);
        System.out.println("Size is : "+ linkedList.size());
        linkedList.print();

        linkedList.delete(1);
        System.out.println("Head is : "+ linkedList.head.data);
        System.out.println("Tail is : "+ linkedList.tail.data);
        System.out.println("Size is : "+ linkedList.size());
        linkedList.print();

        linkedList.delete(10);
        System.out.println("Head is : "+ linkedList.head.data);
        System.out.println("Tail is : "+ linkedList.tail.data);
        System.out.println("Size is : "+ linkedList.size());
        linkedList.print();

        linkedList.delete(4);
        System.out.println("Head is : "+ linkedList.head.data);
        System.out.println("Tail is : "+ linkedList.tail.data);
        System.out.println("Size is : "+ linkedList.size());
        linkedList.print();
        
    }


    
}