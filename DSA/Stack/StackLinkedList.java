package Stack;

public class StackLinkedList{

    private class Node{
        int data;
        Node next;

        public Node(int data){
            this.data=data;
        }
    }
        private Node top;

        public boolean isEmpty(){
            return top==null;
        }


        public void push(int value){
            Node newNode=new Node(value);
            newNode.next=top;
            top=newNode;
            System.out.println("Pushed value is "+ value);
        }
        public int pop(){
            if(isEmpty()){
                System.out.println("Stack is empty");
                return -1;
            }
            int popped=top.data;
            top=top.next;
            System.out.println("popped element is "+ popped);
            return popped;

        }
        public int peek(){
            if(isEmpty()){
                System.out.println("Stack is empty");
                return -1;
            }
            return top.data;
        }

        public int size(){
            int count=0;
            Node current=top;
            while(current!=null){
                count++;
                current=current.next;
            }
            return count;
        }

        public void display(){
            if(isEmpty()){
                System.out.println("Stack is Empty");
                return;
            }
            System.out.println("The satck is ");
            Node current=top;
            while(current!=null){
                System.out.print(current.data + " ");
                current=current.next;
            }
            System.out.println();
        }

        public static void main(String[] args) {
            StackLinkedList stack=new StackLinkedList();
    
            stack.push(10);
            System.out.println("Top element is "+ stack.peek());
            System.out.println("Size is :"+ stack.size());
            stack.display();
    
            stack.push(20);
            System.out.println("Top element is "+ stack.peek());
            System.out.println("Size is :"+ stack.size());
            stack.display();
    
            stack.push(30);
            System.out.println("Top element is "+ stack.peek());
            System.out.println("Size is :"+ stack.size());
            stack.display();
    
            stack.push(40);
            System.out.println("Top element is "+ stack.peek());
            System.out.println("Size is :"+ stack.size());
            stack.display();
    
            stack.push(50);
            System.out.println("Top element is "+ stack.peek());
            System.out.println("Size is :"+ stack.size());
            stack.display();
    
            stack.push(60);
            System.out.println("Top element is "+ stack.peek());
            System.out.println("Size is :"+ stack.size());
            stack.display();
    
            stack.pop();
            System.out.println("Top element is "+ stack.peek());
            System.out.println("Size is :"+ stack.size());
            stack.display();
    
            stack.pop();
            System.out.println("Top element is "+ stack.peek());
            System.out.println("Size is :"+ stack.size());
            stack.display();
    
            stack.pop();
            System.out.println("Top element is "+ stack.peek());
            System.out.println("Size is :"+ stack.size());
            stack.display();
    
            stack.pop();
            System.out.println("Top element is "+ stack.peek());
            System.out.println("Size is :"+ stack.size());
            stack.display();
    
            stack.pop();
            System.out.println("Top element is "+ stack.peek());
            System.out.println("Size is :"+ stack.size());
            stack.display();
    
            stack.pop();
             
    
            System.out.println("Is stack empty ?"+ stack.isEmpty());
        }
    
}

