
import java.util.Scanner;

     
 public class AutoMorphic1{// Automorphic number
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int Number = sc.nextInt();
        int squer = Number*Number;
        int PowerDigit = 0;
        int temp = Number;
        while(temp != 0){
           PowerDigit++;
           temp /= 10;
        }
        int Module = (int)Math.pow(10, PowerDigit);
        int RightPart = squer%Module;
        if(RightPart == Number){
            System.out.println("The number is Automorphic: ");
        }
    }
}
