import java.util.Scanner;

public class OddEven {

    public static boolean isEven(int num){
        return num % 2 == 0;
    }
   

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int num = sc.nextInt();
        if(isEven(num)){
            System.out.println("The number is even ");
        }else{
            System.out.println("The number is odd ");
        }
    }
}
