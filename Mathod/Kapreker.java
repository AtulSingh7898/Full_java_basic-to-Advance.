import java.util.Scanner;

public class Kapreker {

    public static boolean isKaprekar(int num){
        int temp = num;
        int Square = num*num;
        int countDigit = 0;
        int Module = 0;
        while(temp != 0){
            temp /= 10;
            countDigit++;
        }
        Module = (int)Math.pow(10, countDigit);
        int rightpart = Square%Module;
        int leftPart = Square/Module;
        int BothPart = rightpart+leftPart;
        return BothPart == num;
    }
    
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number:");
        int num = sc.nextInt();
        if(isKaprekar(num)){
            System.out.println("The number is Kapreker");
        }else{
            System.out.println("The number is Not kapreker");
        }

        

        // Scanner sc = new Scanner(System.in);
        // System.out.println("Enter the Number");
        // int num = sc.nextInt();

        // if(kaPreNum(num)){
        //     System.out.println("The Number is Kaprekar");
        // }else{
        //     System.out.println("The number is Not Kapreker");
        // }

        
    }
    
}
