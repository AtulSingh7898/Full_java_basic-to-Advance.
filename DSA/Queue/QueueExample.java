// package Queue;

import java.util.LinkedList;
import java.util.Queue;

public class QueueExample {
    public static void main(String[] args) {
        Queue<String> queue=new LinkedList<>();

        queue.offer("Apple");
        queue.offer("Orange");
        queue.offer("Banana");

        System.out.println("Queue is : "+ queue);
        String front=queue.peek();
        System.out.println("Front Element is "+ front);

        String removedElement=queue.poll();
        System.out.println("Deleted eleemnt is "+ removedElement);


        System.out.println("Queue is : "+ queue);

        boolean isEmpty=queue.isEmpty();
        System.out.println("Queue is Empty ? "+ isEmpty);

        int size=queue.size();
        System.out.println("Size is : "+ size);

    }

    
}

