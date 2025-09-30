import java.util.Scanner;

public class KeprekerNumber {
    

     
// Automorphic number
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = 45;
        int square = num*num;
        int temp = num;
        int digits = 0;
        while(temp != 0) {
            digits++;
            temp /= 10;
        }
        int modulus  = (int)Math.pow(10, digits);
        int leftPart  = square% modulus;
        int rightPart = square/modulus;

        if((leftPart+rightPart) == num) {
            System.out.println(num+" number is a Kepreker: ");
        }else{
            System.out.println(num+" number is not a Kepreker: ");
        }
    }
}
