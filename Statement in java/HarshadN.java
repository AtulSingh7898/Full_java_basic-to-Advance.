import java.util.Scanner;

public class HarshadN {
    public static int harshadNum(int Number){
        int temp = Number;
        int result = 0;
        while (temp != 0) {
            int digit = temp%10;
            result +=digit;
            temp/= 10;
        }
        return result;
        
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number ");
        int Number = sc.nextInt();
        int result = harshadNum(Number);
        if(Number%result==0){
            System.out.println("The Number is harshad Num");
        }else{
            System.out.println("The Number is not harsh Number");
        }
    }
}
