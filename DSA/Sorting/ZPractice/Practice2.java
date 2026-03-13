class LL{
    class Node{
        public int data;
        public Node next;

        public Node(int data){
            this.data = data;
            this.next = null;
        }
    }

    public Node head;
    public Node tail;

    public LL(){
        this.head = null;
        this.tail = null;
    }
    
    public void insertAtHead(int data){
        Node newNode = new Node(data);
        newNode.next = head;
        head = newNode;
        System.out.println(tail);
        if(tail == null){
            tail= newNode;
        }
    }
    public void print(){
        if(head != null){
            System.out.println(head.data+" ");
            System.out.println(head.next+" ");
        }
    }
}

public class Practice2 {
    public static void main(String[] args) {
        LL linkedlist = new LL();
        linkedlist.insertAtHead(5);
        linkedlist.print();
        
    }
}
