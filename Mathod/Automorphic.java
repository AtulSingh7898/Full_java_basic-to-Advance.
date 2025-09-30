import java.util.Scanner;

public class Automorphic {
    public static int isAutoMorphic(int n){
        int module = 0;
        int Square = n*n;
        int temp = n;
        int CountPower = 0;
        while(temp != 0){
            temp /= 10;
            CountPower++;
        }
        module = (int)Math.pow(10, CountPower);

        int rightPart = Square%module;
        return rightPart;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.print("Enter the number: ");
        for(int i = 1; i <= 100; i++){
        int n = i;
        int rightPart = isAutoMorphic(n);
        if(rightPart ==  n){
            System.out.println(rightPart);
            // System.out.println("The number is AuroMorphic");
        }
        // else{
        //     System.out.println("The number is Not AuroMorphic");
        // }

        }

    }
    
}
