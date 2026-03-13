//Stack
import java.util.Stack;

public class Main {

    public static void main(String[] args) {
        Stack<String> stack=new Stack<>();
        stack.push("Apple");
        stack.push("Banana");
        stack.push("Orange");

        System.out.println("Stack is "+ stack);
        String topElement=stack.peek();
        System.out.println("Size of the stack is : "+ stack.size());

        int position=stack.search("Apple");
        if(position!=-1){
            System.out.println("Apple found at : "+ position);
        }else{
            System.out.println("Apple not found ");
        }

        System.out.println("Top element is "+ topElement);
        String poppedElement=stack.pop();
        System.out.println("Popped eleemnt is :" +poppedElement);
        System.out.println("Size of the stack is : "+ stack.size());

        System.out.println("Stack is "+ stack);

        int position1=stack.search("Apple");
        if(position1!=-1){
            System.out.println("Apple found at : "+ position1);
        }else{
            System.out.println("Apple not found ");
        }
        boolean isEmpty=stack.isEmpty();
        System.out.println("Is Stack Empty ? "+ isEmpty);

        int size=stack.size();
        System.out.println("Size of the stack is "+ size);

        stack.clear();
        System.out.println("Stack after clearing is "+ stack);

        boolean isEmpty1=stack.isEmpty();
        System.out.println("Is Stack Empty ? "+ isEmpty1);



    }
}