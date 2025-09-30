import java.util.Scanner;
public class Prectic {
    //Explicit Typecasting or Narrowing or Manual type casting

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Mark: ");
        char Oparater = sc.next().charAt(0);//Error
        // Scanner sc = new Scanner(System.in);
        System.out.print("Enter The number: ");
        int a = sc.nextInt();
        // System.out.print("Enter the Mark: ");
        // char Oparater = sc.next().charAt(0);
        System.out.print(" Enter the second no: ");
        int b = sc.nextInt();

        // int x = (int)23.443453;
        // double x1 = 20.4;
        // int y = (int)x1;

        // System.out.println(y);
        // System.out.println(x);

        

        switch (Oparater) {
            case '+':System.out.println("The"+a+ "+"+b+ "="+(a-b));
            break;
            case '-':System.out.println("The"+a+ "-"+b+ "="+(a-b) ); break;
            case '*':System.out.println("The"+a+ "*"+b+ "="+(a*b) ); break;
            case '/':
            if(b != 0){
                System.out.println("The"+a+ "/"+b+ "="+(a/b));
            }else{
                
                System.out.println("this Number is not divid: Its Zero");
            }
            break;
            default: System.out.println("It Not an Oparater ");
        }
        
    }

    
}
