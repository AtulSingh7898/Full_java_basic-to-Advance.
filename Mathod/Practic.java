import java.util.Scanner;
public class Practic {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // int num = 101010101;
        // int result = (num/2)*2;
        //wihtout using module %
        // if(result == num){
        //     System.out.println("The number is even");
        // }else{
        //     System.out.println("The Number is Odd");
        // }

        //without using Divid and Modulo as well
        // if((num&1)==0){
        //     System.out.println("THe number is even ");
        // }else{
        //     System.out.println("The number is Odd");
        // }

        // Chack Number is Binary And Not
        // int num = 101010102;
        // int result = 0;
        // boolean isBinary = true;
        // int temp = num;
        // while(temp > 0){
        //     int Digit = temp%10;
        //     if(Digit != 0 && Digit != 1){
        //         isBinary = false;
        //         break;
        //     }
        //     temp /= 10;
        // }
        // if(isBinary){
        //     System.out.println("The Number is Binary");
        // }else{
        //     System.out.println("The Number is Not Binary");
        // }

        //Decimal to Binary
        // int num = 14;
        // String str = "";
        // int temp = num;
        // while(temp != 0){
        //     int remainder = temp%2;
        //     str = remainder+str;
        //     temp /=2;
        // }
        // System.out.println("The Decime number "+num+" is "+str);
    
        //Decimal to octal Conversion
        // int num = 87;
        // int temp = num;
        // String result = "";
        // while(temp != 0){
        //     int Digit = temp%8;
        //     result = Digit+result;
        //     temp /= 8;
        // }
        // System.out.println("The Decimal Number is "+num+" to octal is "+result);

        // Binary to Decimal 
        // int num = 0110;
        // int CountPower = 0;
        // int result = 0;
        // int temp = num;
        // while(temp != 0){
        //     int Digit = temp%10;
        //     result = result+Digit*(int)Math.pow(2, CountPower);
        //     temp /= 10;
        //     CountPower++;
        // }
        // System.out.println("The Binary is "+num+" to this "+result);

        // Octal TO Decimal system
        // int num = 131;
        // int octal = num;
        // int result = 0;
        // int CountPower = 0;
        // while (octal != 0) {
        //     int Digit = octal%10;
        //     result = result+Digit*(int)Math.pow(8, CountPower);
        //     octal /= 10;
        //     CountPower++;
        // }
        // System.out.println("The Octal is "+num+" to this is "+result);
    }
    
}
