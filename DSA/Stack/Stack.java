//Stack using Array

public class Stack{
    private int top;
    private int maxSize;
    private int[] stackArray;


    public Stack(int size){
        maxSize=size;
        stackArray=new int[maxSize];
        top=-1;
    }

    public boolean isEmpty(){
        return (top==-1);
    }

    public boolean isFull(){
        return (top==maxSize-1);
    }

    public void push(int element){
        if(isFull()){
            System.out.println("Stack is full");

        }else{
            stackArray[++top]=element;
            System.out.println("Pushed element is "+ element);

        }
    }

    public int pop(){
        if(isEmpty()){
            System.out.println("Stack is Empty");
            return -1;
        }else{
            int poppedElement=stackArray[top--];
            System.out.println("Popped element is "+ poppedElement);
            return poppedElement;
        }
    }
    public int peek(){
        if(isEmpty()){
            System.out.println("stack is empty so no top element");
            return -1;
        }else{
            return stackArray[top];
        }
    }
    public int size(){
        return top+1;
    }
    public void display(){
        if(isEmpty()){
            System.out.println("Stack is empty");
        }else{
            System.out.println("Stack elements are ");
            for(int i=0;i<=top;i++){
                System.out.print(stackArray[i]+" ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Stack stack=new Stack(5);

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