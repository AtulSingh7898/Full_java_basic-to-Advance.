import java.util.Scanner;

public class Ques31 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
            System.out.print("Enter the any Tringle Number: ");

            // //mathod first
            // int x = sc.nextInt();
            // int y = sc.nextInt();
            // int z = sc.nextInt();
            // int sum = x + y + z;
            // if(sum == 180 ){
            //     System.out.println("Vailid Tringle");
            // }else{
            //     System.out.println("Invailid Tringle");
            // }
            int sum = 0;
            
        
         for(int i= 1; i <= 3; i++){
            int d = sc.nextInt();
            sum += d;
         }
         if(sum == 180){
            System.out.println("Valid Tringle");
        }else{System.out.println("Invailid tringle");}
   }
}
