//Queue using LinkedList
class Node{

    int data;
    Node next;
    public Node(int data){
        this.data=data;
        this.next=null;
    }

}

public class QueueExample2 {

    private Node front;
    private Node rear;
    private int size;

    public QueueExample2(){
        // front=null;
        // rear=null;
        front=rear=null;
        size=0;

    }

    public boolean isEmpty(){ 
        return front==null;
    }
    public int size(){
        return size;
    }

    public void enqueue(int element){
        Node newNode=new Node(element);
        if(isEmpty()){
            front=rear=newNode;
        }else{
            rear.next=newNode;
            rear=newNode;
        }
        size++;
        System.out.println("Enqueued element is : "+ element);
    }
    public int dequeue(){
        if(isEmpty()){
            System.out.println("Queue is empty ");
            return -1;
        }
        int removedElement=front.data;
        front=front.next;
        size--;
        System.out.println("Removed element is "+ removedElement);
        return removedElement;
    }

    public int peek(){
        if(isEmpty()){
            System.out.println("Queue is empty ");
            return -1;
        }
        return front.data;
    }

    public void display(){
        if(isEmpty()){
            System.out.println("Queue is empty ");
            return;
        }
        System.out.println("Queue is :");
        Node temp=front;
        while (temp!=null) {
            System.out.print(temp.data + " ");
            temp=temp.next;
            
        }
        System.out.println();
    }

    public static void main(String[] args) {
        QueueExample2 queue=new QueueExample2();

        queue.enqueue(10);
        System.out.println("Front element is "+ queue.peek());
        System.out.println("Size is : "+ queue.size());
        queue.display();

        queue.enqueue(20);
        System.out.println("Front element is "+ queue.peek());
        System.out.println("Size is : "+ queue.size());
        queue.display();

        queue.enqueue(30);
        System.out.println("Front element is "+ queue.peek());
        System.out.println("Size is : "+ queue.size());
        queue.display();

        queue.enqueue(40);
        System.out.println("Front element is "+ queue.peek());
        System.out.println("Size is : "+ queue.size());
        queue.display();

        queue.enqueue(50);
        System.out.println("Front element is "+ queue.peek());
        System.out.println("Size is : "+ queue.size());
        queue.display();

        queue.enqueue(60);
        System.out.println("Front element is "+ queue.peek());
        System.out.println("Size is : "+ queue.size());
        queue.display();

        queue.dequeue();
        System.out.println("Front element is "+ queue.peek());
        System.out.println("Size is : "+ queue.size());
        queue.display();

        queue.dequeue();
        System.out.println("Front element is "+ queue.peek());
        System.out.println("Size is : "+ queue.size());
        queue.display();

        queue.dequeue();
        System.out.println("Front element is "+ queue.peek());
        System.out.println("Size is : "+ queue.size());
        queue.display();

        queue.dequeue();
        System.out.println("Front element is "+ queue.peek());
        System.out.println("Size is : "+ queue.size());
        queue.display();

        queue.dequeue();
        System.out.println("Front element is "+ queue.peek());
        System.out.println("Size is : "+ queue.size());
        queue.display();

        queue.dequeue();
        System.out.println("Front element is "+ queue.peek());
        System.out.println("Size is : "+ queue.size());
        queue.display();
    }
}
