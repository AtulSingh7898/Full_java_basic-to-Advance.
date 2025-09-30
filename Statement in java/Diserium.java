import java.util.Scanner;

public class Diserium {

    public static int disriUm(int Number){
        
        int modulus = 0;
        int temp = Number;
        int Square = Number*Number;
        int countPower = 0;
        while(temp != 0){
            
            temp /= 10;
            countPower++;
        }
        temp = Number;
        while(temp != 0){
            // int digit = temp%10;
            countPower++;
            modulus = (int)Math.pow(10, countPower);
            temp /= 10;
        }
        int rightPart = Square%modulus;
        int leftPart = Square/modulus;
        int Bothpart = rightPart+leftPart;

        return Bothpart;


    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int Number = sc.nextInt();
        int Bothpart = disriUm(Number);
        if(Bothpart == Number){
            System.out.println("The number is DIssarir");
        }else{
            System.out.println("The number is not Diserium");
        }
        

        
    }
}
