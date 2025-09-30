import java.security.DigestOutputStream;
import java.util.Scanner;

public class Practic1 {

    // public static int strongNumber(int Number){
    //     int result = 0;
    //     int temp = Number;
    //     while(temp > 0){
    //         int Product = 1;
    //         int Digit = temp%10;
    //         for(int i = 1; i <= Digit; i++){
    //             Product *= i;
    //         }
    //         result += Product;
    //         temp /=10;
    //     }
    //     return result;
    // }
     
    // public static boolean primeNumber(int Number){
    //     boolean isPrime = true;
    //     for(int i = 2; i <=Number/2; i++){
    //         if(Number%i == 0){
    //             isPrime = false;
    //         }
    //     }
    //     return isPrime;
    // }

    // public static int armStrong(int Number){
    //     int temp = Number;
    //     int result = 0;
    //     int PowerDigit = 0;
    //     while(temp > 0){
    //         temp /=10;
    //         PowerDigit++;
    //     }
    //     temp = Number;
    //     while(temp >0){
    //         int Digit = temp%10;
    //         result += (int)Math.pow(Digit, PowerDigit);
    //         temp /= 10;
    //     }
    //     return result;
    // }

    // public static int harshadNumber(int Number){
    //     int temp = Number;
    //     int result = 0;
    //     while(temp > 0){
    //         int Digit = temp%10;
    //         result += Digit;
    //         temp /= 10;
    //     }
    //     return result;
    // }
   
    // public static int disariumNumber(int Number){
    //     int temp = Number;
    //     int result = 0;
    //     int PowerDigit = 0;
    //     while(temp>0){
    //         temp/=10;
    //         PowerDigit++;
    //     }
    //     temp = Number;
    //     while (temp > 0) {
    //         int Digit = temp % 10;
    //         result +=(int)Math.pow(Digit, PowerDigit);
    //         temp /=10;
    //         PowerDigit--;
    //     }
    //     return result;
    // }
    
    
    // public static int automosphicNum(int Number){
    //     // int Number = 25;
    //     int Square = Number*Number;
    //     int temp = Number;
    //     int DigitPower = 0;
    //     int result = 0;
    //     while(temp > 0){
    //         DigitPower++;
    //         temp /= 10;
    //     }
    //     result =(int)Math.pow(10, DigitPower);
    //     int rightPart = Square%result;
    //     return rightPart;
    // }
    
    // public static int kapreKar(int Number){
    //     int Square = Number*Number;
    //     int result = 0;
    //     int temp = Number;
    //     int PowerDigit = 0;
    //     while(temp != 0){
    //         temp /= 10;
    //         PowerDigit++;
    //     }
    //     result = (int)Math.pow(10, PowerDigit);
    //     int rightPart = Square%result;
    //     int leftPart = Square/result;
    //     int BothPart = rightPart+leftPart;
    //     return BothPart;
    // }
    
    public static int spyNumber(int Number){
        int temp = Number;
        int Digit = 0;
        int Product = 1;
        int result = 0;

        while (temp > 0) {
            int Digitto = temp%10;
            Digit += Digitto;
            Product *= Digitto;
            temp/=10;

        }
        if(Digit == Product){
            System.out.println("The Number is spy Number");
        }else{
            System.out.println("the Number is Not spy Number: ");
        }
        return result;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int Number = sc.nextInt();

        //Spy Number 
        int result = spyNumber(Number);
        // if(result == Number){
        //     System.out.println("");
        // }

        // //Kapraker Number;
        // int BothPart = kapreKar(Number);
        // if(BothPart == Number){
        //     System.out.println("The Number is Kapreker Number:");
        // }else{
        //     System.out.println("The Number is Not Kapraker");
        // }

        // //Automorphic Number
        // int result = automosphicNum(Number);
        // if(Number==result){
        //     System.out.println("The Number is Automosrphic Number");
        // }else{
        //     System.out.println("the Number is Not Automosrphic Number");
        // }

        // //Disarium number
        // int result = disariumNumber(Number);
        // if(Number==result){
        //     System.out.println("The Number is Diaserium Number");
        // }else{
        //     System.out.println("the Number is Not Disarium Number");
        // }

        //Harshad Number
        // int result = harshadNumber(Number);
        // if(Number%result==0){
        //     System.out.println("The Number is Harshad Number");
        // }else{
        //     System.out.println("the Number is Not Harshad Number");
        // }

         //ArmsStrnong Number
        // int result = armStrong(Number);
        // if(result == Number){
        //     System.out.println("The number is Armstrong");
        // }else{
        //     System.out.println("The Number is Not Armstrong Number: ");
        // }

        // Strong Number
        // int result = strongNumber(Number);
        // if(result == Number){
        //     System.out.println(result+" Is the Strong Number");
        // }else{
        //     System.out.println(Number+" Is Not Strong  Number");
        // }
        
        //Prime Number 
        // boolean isPrime = primeNumber(Number);
        // if(isPrime){
        //     System.out.println("The Number is Prime Number: ");
        // }else{
        //     System.out.println("The Number is Not Prime");
        // }
    }
    
}
