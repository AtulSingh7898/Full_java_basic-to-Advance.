import java.util.Scanner;

public class Calculator {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the first Number: ");
        int a = sc.nextInt();
        System.out.print("Enter Oparater: ");
        char op = sc.next().charAt(0);
        System.out.print("Enter the second Number: ");
        int b = sc.nextInt();

        int result = 0;
        boolean valid = true;

        switch (op) {
            case '+': result = a+b; break;
            case '-': result = a-b; break;
            case '*': result = a*b; break;
            case '/': 
            if(b != 0) result = a/b;
            else{
                System.out.println("Cannot this Oparation Perform: ");
                valid = false;
            }
            break;
            case '%' : if(b != 0) result = a % b;
            else{
                System.out.println("Cannot this Oparation Perform: ");
                valid = false;
            }
            break;
            default: System.out.println("Enter the valid opareter: ");;
            
        }
        if(valid){
            System.out.println("Result -> "+ result);
        }
        

    }
}
