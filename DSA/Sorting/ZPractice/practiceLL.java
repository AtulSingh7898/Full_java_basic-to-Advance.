// package Sorting.ZPractice;

class LL {

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
        if(tail == null){
            tail = newNode;
        }
    } 

    public void insertAtTail(int data){
        Node newNode  = new Node(data);
        if(tail == null){
            head = newNode;
            tail = newNode;
        }else{
            tail.next = newNode;
            tail = newNode;
        }
    }

    

    

    public void insertAtMiddle(int position,int data){
        if(position<= 1){
            insertAtHead(data);
        }else if(position>size()){
            insertAtTail(data);
        }else{
            Node newNode = new Node(data);

            Node temp = head;
            int count = 1;

            while(count<position - 1){
                temp = temp.next;
                count++;
            }
            newNode.next = temp.next;
            temp.next = newNode;
        }

    }

    public void delete(int position){
        if(position == 1){
            if(tail == head){
                tail = null;
            }
            head = head.next;
        }else{
            Node curr = head;
            Node prev = null;
            int count = 1;
            if(count < position){
                prev = curr;
                curr = curr.next;
                count++;
            }
            prev.next = curr.next;
            if(curr == tail){
                tail = prev;
            }

        }

    }

    public int size(){
        int count  = 0;
        Node temp = head;

        if(temp != null){
            temp = temp.next;
            count++;
        }
        return count;

    }

    public void print(){
        Node temp = head;
        while(temp != null){
            System.out.print(temp.data+" ");
            temp = temp.next;
        }
        System.out.println();
    }
    
}

public class practiceLL{
    public static void main(String[] args) {
        LL linkedlist = new LL();
        linkedlist.insertAtHead(11);
        System.out.println("Head is: "+linkedlist.head.data);
        System.out.println("Tails is: "+linkedlist.tail.data);
        System.out.println("size is: "+linkedlist.size());
        linkedlist.print();
        linkedlist.insertAtTail(12);
        System.out.println("Head is: "+linkedlist.head.data);
        System.out.println("Tails is: "+linkedlist.tail.data);
        System.out.println("size is: "+linkedlist.size());
        linkedlist.print();
    }
}