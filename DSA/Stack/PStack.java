public class PStack {
    private int top;
    private int maxSize;
    private int[] newArray;

    public PStack(int size){
        maxSize = size;
        newArray = new int[maxSize];
        top =-1;
    }

    public boolean isFull(){
        if(top==maxSize-1){
            return true;
        }
        return false;
    }

    public void push(int element){
        if(isFull()){
            System.out.println("the stack is full");
        }
        newArray[++top] = element;
    }


    public boolean isEmpty(){
        if(top == -1){
            return true;
        }else{
            return false;
        }
    }

    public int pop(){
        if(isEmpty()){
            System.out.println("The Stack is empty");
        }
        int elements = newArray[top--];
        System.out.println("the pop element is "+elements);
        return elements;


    }
    public int size(){
        if(isEmpty()){
            System.out.println("stack are empty");
        }
        return (top+1);
    }
    public int peek(){
        if(isEmpty()){
            System.out.println("empty array");
        }
        return newArray[top];
    }
    public void clear(){
        top =-1;
        // return top;

    }
    public void display(){
        if(isEmpty()){
            System.out.println("stack are empty");
        }
        for(int i = top; i >=0; i--){
            System.out.print(newArray[i]+" ");
        }
        System.out.println();
    }
    

    

    public static void main(String[] args) {
        PStack stack = new PStack(5);
        stack.push(10);
        stack.push(20);
        stack.display();
        
        System.out.println("the size is "+stack.size());
        System.out.println("peek element of the arr"+stack.peek());
        stack.display();

        stack.clear();
        System.out.println("the are empty of not "+stack.isEmpty());
        stack.display();
        stack.push(5);
        stack.push(15);
        stack.push(10);
        stack.push(12);
        stack.push(14);
        stack.display();
        
    }
    
}
