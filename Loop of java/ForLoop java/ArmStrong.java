//ArmStrong Number

import java.util.Scanner;
public class ArmStrong {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // System.out.println("Eneter a number: ");
        int number = 153;
        // sc.nextInt();
    
        // int power = Math.pow(3, 3);
        int originalNumber = number;
        int result = 0;
        int numberOfDigit = 0;
        int temp = number;
        while (temp != 0) {
            temp =  temp / 10;
            numberOfDigit++;
        }
        temp = number;
        
        while(temp != 0){
            int digit = temp %10;
            result +=(int)Math.pow(digit, numberOfDigit);
            temp = temp /10;
            
        }
        if(result == originalNumber){
            System.out.println("The number is a armstrong Number");
        }else{
            System.out.println("The number is Not a armstrong Number");
        }
       
    }
    
}
