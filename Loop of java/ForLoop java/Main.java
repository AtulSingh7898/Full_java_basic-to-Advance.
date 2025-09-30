import java.util.*;
public class Main{
    public static void main(String []args){
        // Scanner sc = new Scanner(System.in);
        // System.out.print("Enter the number: ");
        // int a = sc.nextInt();
        // System.out.print("Enter the number: ");
        // int b = sc.nextInt();

        
        // for(int i = a; i <= b ; i++ ){

        //     System.out.println("The Table of "+ i+ " is "+(i*2));
        // }
        int sum = 0;

        for(int i = 1; i <= 100; i++ ){

            
            if(i%2 == 0){
            

            sum += i;
            System.out.println(sum);
            }
            
            //else{
            //     System.out.println(""+i);
            // }
             
        }
        // System.out.println(sum);
    }
}