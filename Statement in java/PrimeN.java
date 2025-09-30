import java.util.Scanner;

public class PrimeN {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        // System.out.print("Enter the number: ");
        // int n = sc.nextInt();

        // if(n%2 == 0){
        //     if(n/2 == 1){
        //         System.out.println("Prime Number:");
        //     }else{
        //         System.out.println("ItS Not Prime Number");
        //     }
        // }else if(n%3 == 0 || n%5 == 0){
        //     System.out.println(" Its Not Prime Number:");
        // }else if(n%1 == 0 && n%n == 0){
        //     System.out.println("Prime Number:");
        // }
        int count = 0;
        int n = 4;
        for(int j = 2; j <= n; j++){
        int Prime = j;
        int flag = 1;
        for(int i = 2; i<= Prime/2; i++){
            if(Prime%i == 0){
                flag = 0;
                break;
            }
        }
        if(flag == 1){
            count++;
            // System.out.println(j);
            // System.out.println("The number is Prime");
        }
    }
    System.out.println(count);
    }
}