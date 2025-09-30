import java.util.Scanner;

public class Practic2 {
    
    // public static int evenOdd(int num){
    //     int Questient =num/2;
    //     // int result = (num/2)*2;
    //     int result =  Questient*2;
    //     return result;
    // }

    // public static int isBinary(int Binary){
    //     int isBinary = 1;
    //     int temp = Binary;
    //     while(temp != 0){
    //         int Digit = temp%10;
    //         if(Digit != 1 &&  Digit != 0){
    //             isBinary = 0;
    //             break;
    //         }
    //         temp /=10;
    //     }
    //     return isBinary;
    // }

    // public static int binaryToDecimal(int num){
    //     int temp = num;
    //     int result = 0;
    //     int PowerDigit = 0;
    //     while(temp != 0){
    //         int Digit = temp%10;
    //         result+=Digit*(int)Math.pow(2, PowerDigit);
    //         PowerDigit++;
    //         temp /= 10;
    //     }
    //     return result;
    // }
   
    // public static String decimalToBinary(int num){
    //     int temp = num;
    //     String result = "";
    //     while( temp != 0){
    //         int Digit = temp%2;
    //         result = Digit+result;
    //         temp /= 2;
    //     }
    //     return result;
    // }

    public static String decimalToOctal(int num){
        int temp = num;
        String result = "";
        while(temp != 0){
            int Digit = temp%8;
            result = Digit+result;
            temp /= 8;
        }
        return result;
    }
    
    // public static int octalToDecimal(int num){
    //     int temp = num;
    //     int result = 0;
    //     int PowerDigit = 0;
    //     while(temp != 0){
    //         int digit = temp%10;
    //         result += digit*(int)Math.pow(8, PowerDigit);
    //         PowerDigit++;
    //         temp /= 10;
    //     }
    //     return result;
    // }
    
    public static void main(String[] args){

        
        // octal to decimal
        // int num = 141;
        // int result = octalToDecimal(num);
        // System.out.println(result);
    
        // decimal to octal
        // int num = 97;
        // String result = decimalToOctal(num);
        // System.out.println(result);

        // Decimal to Binary
        // int num = 97;
        // String result = decimalToBinary(num);
        // System.out.println(result);

        // Binary to Decimal
        // int num = 1011;
        // int result = binaryToDecimal(num);
        // System.out.println("The number Binary "+num+" is to decimal " +result);

        // Binary to check Binary and Not
        // int Binary = 1010101;
        // int isBinary = isBinary(Binary);
        // if(isBinary==1){
        //     System.out.println("the number is Binary");
        // }else{
        //     System.out.println("The number is Not Binary");
        // }
        
        //Odd even Binary Number 
        // int num = 10101010;
        // int result = evenOdd(num);
        // if(result == num){
        //     System.out.println("The number is even ");
        // }else{
        //     System.out.println("The number is Odd");
        // }
        // Second type formula
        // int num = 0101002;
        // if((num&2)==0){
        //     System.out.println("The Number is even");
        // }else{
        //     System.out.println("The number is odd");
        // }
    }    
}    
    



