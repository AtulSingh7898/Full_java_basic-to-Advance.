import java.util.Scanner;

public class Pracitic3 {

    
    // public static boolean isPrimeNum(int num){
    //      boolean isPrime = true;
    //     for(int i = 1; i <= num/2; i++){
    //         if(num%i == 0){
    //             isPrime = false;
    //             break;
    //         }
    //     }
    //     if(isPrime){
    //         System.out.println("The number is Prime ");
    //     }else{
    //         System.out.println("The number is not prime");
    //     }
    //     return true;
    // }
    
    // public static int armstrongNum(int number){
    //     int temp = number;
    //     int powerDigit = 0;
    //     int result = 0;
    //     while(temp != 0){
    //          temp/=10;
    //         powerDigit++;
    //     }
    //     temp = number;
    //     while(temp != 0){
    //         int digit = temp%10;
    //         result += (int)Math.pow(digit, powerDigit);
    //         temp /=10;
    //     }
    //     return result;
    // }

    // public static int strongnumber(int num){
    //     int temp = num;
    //     int resutl = 0;
    //     while (temp != 0) {
    //         int digit = temp%10;
    //         int Product = 1;
    //         for(int i = 1; i <= digit;i++){
    //             Product *= i;
    //         }
    //         temp /= 10;
    //         resutl += Product;
    //     }
    //     return resutl;
    // }

    // public static int harshadNum(int Num){
    //     int temp = Num;
    //     int result = 0;
    //     while(temp != 0){
    //         int digit = temp%10;
    //         result += digit;
    //         temp /= 10;
    //     }
    //     return result;
    // }
    
    //  public static int autoMorphic(int Number){
    //     int temp = Number;
    //     int Square = Number*Number;
    //     int Module = 0;
    //     int powerDigit = 0;
    //     while(temp != 0){
    //         powerDigit++;
    //         temp /=10;
    //     }
    //     Module = (int)Math.pow(10, powerDigit);
    //     int rightPart = Square%Module;
    //     return rightPart;
    // }
  
    // public static int diseriumNumber(int Number){
    //     int temp = Number;
    //     int result = 0;
    //     int powerDigit = 0;
    //     while (temp != 0) {
    //        temp /= 10;
    //        powerDigit++;
    //     }
    //     temp = Number;
    //     while (temp != 0) {
    //         int Digit = temp%10;
    //         result +=(int)Math.pow(Digit, powerDigit);
    //         temp /= 10;
    //         powerDigit--;
    //     }
    //     return result;
    // }
   
    // public static int kaprekerNumber(int Number){
    //     int temp = Number;
    //     int Square = Number*Number;
    //     int powerDigit = 0;
    //     int Module = 0;
    //     while(temp != 0){
    //         temp /= 10;
    //         powerDigit++;
    //     }
    //     Module = (int)Math.pow(10, powerDigit);
    //     int rightPart = Square%Module;
    //     int leftPart = Square/Module;
    //     int BothPart = rightPart +leftPart;
    //     return BothPart;
    // }
   
//    public static void spyNumber(int num){
//         int temp = num;
//         int result = 0;
//         int Produt = 1;
//         while(temp != 0){
//             int digit = temp%10;
//             result += digit;
//             Produt *= digit;
//             temp /= 10;
//         }     
//         if(result == Produt){
//             System.out.println("The Number is spy Number");
//         }else{
//             System.out.println("the Number is Not spy Number ");
//         }
//    }
   
    // public static int painlindromNumber(int num){
    // int result = 0;
    //     int temp = num;
    //     while(temp != 0){
    //         int digit = temp%10;
    //         result = result*10+digit;
    //         temp /= 10;
    //     }
    //     return result;
    // }
public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //Pailindrom Number
        // int num = sc.nextInt();
        // int result = painlindromNumber(num);
        // if(result == num){
        //     System.out.println("The number is Pailindrom");
        // }else{
        //     System.out.println("the number is not Poilindrom");
        // }

        //spy Number
        // int num = sc.nextInt();
        // spyNumber(num);

        // Kapreker Number;
        // int Number = 45;
        // int BothPart = kaprekerNumber(Number);
        // if(BothPart == Number){
        //     System.out.println("The Number is Kaprker");
        // }else{
        //     System.out.println("The number is Not Kapreker");
        // }

        //Diserium Number
        // int Number = 135;
        // int result = diseriumNumber(Number);
        // if(result == Number){
        //     System.out.println("The number is diserim Number");
        // }else{
        //     System.out.println("The number is not Diserium Number");
        // }
        
        //Automorphic Number
        // int Number = 6;
        // int rightPart = autoMorphic(Number);
        // if(rightPart == Number){
        //     System.out.println("the number is automorphic");
        // }else{
        //     System.out.println("The Number is Not Automophic Number");
        // }      

        // Harshad Number
        // int Num = 14;
        // int result=harshadNum(Num);
        // if(Num%result == 0){
        //     System.out.println("The number is Harshad Number: ");
        // }else{
        //     System.out.println("The Number is Not harshad Number:");
        // }

        // Strong Number
    //     int num = 15;
    //     int result = strongnumber(num);
    //      if(result == num){
    //     System.out.println("The number is Stonrng Number ");
    //   }else{
    //     System.out.println("the number is Not strong number");
   // }
        
        // Armstrong Number
        // int number = 153;
        // int result = armstrongNum(number);
        // if(result == number){
        //     System.out.println("The number is Armstrong Number");
        // }else{
        //     System.out.println("The number is Not armstrong Number");
        // }

        // Prime Number
        // int num = 4;
        // isPrimeNum(num);
        // boolean isPrime = true;
        // for(int i = 1; i <= num/2; i++){
        //     if(num%i == 0){
        //         isPrime = false;
        //         break;
        //     }
        // }

    }
}
