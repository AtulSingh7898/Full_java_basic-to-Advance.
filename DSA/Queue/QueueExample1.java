//Queue using array
// https://leetcode.com/problems/maximum-count-of-positive-integer-and-negative-integer/description/

public class QueueExample1 {

    private int[] queueArray;
    private int front;
    private int rear;
    private int size;
    private int capacity;

    public QueueExample1(int capacity){
        this.capacity=capacity;
        queueArray=new int[capacity];
        front=0;
        rear=-1;
        size=0;
    }

    public boolean isEmpty(){
        return size==0;
    }

    public boolean isFull(){
        return size==capacity;
    }

    public int size(){
        return size;
    }

    public void enqueue(int element){
        if(isFull()){
            System.out.println("Queue is full ");
            return;
        }
        rear=(rear+1)%capacity;
        queueArray[rear]=element;
        size++;
        System.out.println("Enqueued Element is :"+ element);
    }

    public int dequeue(){
        if(isEmpty()){
            System.out.println("Queue is Empty ");
            return -1;
        }
        int removedElement=queueArray[front];
        front=(front+1)%capacity;
        size--;
        System.out.println("Dequeued element is "+ removedElement);
        return removedElement;
    }
    public int peek(){
        if(isEmpty()){
            System.out.println("Queue is Empty");
            return -1;
        }
        return queueArray[front];
    }

    public void display(){
        if(isEmpty()){
            System.out.println("Queue is empty");
            return;
        }
        System.out.println("Queue elements are : ");
        int count=0;
        int index=front;
        while(count<size){
            System.out.print(queueArray[index]+ " ");
            index=(index+1)%capacity;
            count++;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        QueueExample1 queue=new QueueExample1(5);

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


        queue.dequeue();
        queue.display();

        // queue.enqueue(40);
        // System.out.println("Front element is "+ queue.peek());
        // System.out.println("Size is : "+ queue.size());
        // queue.display();

        // queue.enqueue(50);
        // System.out.println("Front element is "+ queue.peek());
        // System.out.println("Size is : "+ queue.size());
        // queue.display();

        // queue.enqueue(60);
        // System.out.println("Front element is "+ queue.peek());
        // System.out.println("Size is : "+ queue.size());
        // queue.display();

        // queue.dequeue();
        // System.out.println("Front element is "+ queue.peek());
        // System.out.println("Size is : "+ queue.size());
        // queue.display();

        // queue.dequeue();
        // System.out.println("Front element is "+ queue.peek());
        // System.out.println("Size is : "+ queue.size());
        // queue.display();

        // queue.dequeue();
        // System.out.println("Front element is "+ queue.peek());
        // System.out.println("Size is : "+ queue.size());
        // queue.display();

        // queue.dequeue();
        // System.out.println("Front element is "+ queue.peek());
        // System.out.println("Size is : "+ queue.size());
        // queue.display();

        // queue.dequeue();
        // System.out.println("Front element is "+ queue.peek());
        // System.out.println("Size is : "+ queue.size());
        // queue.display();

        // queue.dequeue();
        // System.out.println("Front element is "+ queue.peek());
        // System.out.println("Size is : "+ queue.size());
        // queue.display();
    }
}

