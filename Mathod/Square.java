import java.util.*;

public class Square {

    public static int Square(int num){
        int Square = num*num;
        // System.out.println(Square);
        return Square;
    }
    public static void main(String[] args) {
        // Scanner sc  = new Scanner(System.in);
        // System.out.println("Enter the number");
        // int num = sc.nextInt();
        // Square(num);

        Scanner sc  = new Scanner(System.in);
        System.out.println("Enter the number");
        int num = sc.nextInt();
        int result = Square(num);
        System.out.println(" is Squer "+result);

        

    }
    
}
