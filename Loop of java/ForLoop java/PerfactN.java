import java.util.Scanner;

public class PerfactN {
    public static void main(String args[]){
        Scanner s = new Scanner(System.in);
        int count = 0;
        // for(int j = 1; j <= 1000; j++){
        
        // int number = 28;

        //Factor Number's
        int number = 1000;
        for(int i = 1; i <= number/2; i++){
            if(number%i == 0){
            System.out.println(i);
            count += i;
            
            }
        }
        if(number == count){
         System.out.println(count+" The Perfact Number");
        }
    


        // Perfact Number
        
        // for(int i = number; i <= number/2; i++){
        //     if(number%i == 0){
        //         // System.out.println(i);
        //         count += i;
        //     }
        // } if(number == count){
        //     System.out.println("the number is perfact");
        // }      
    // System.out.println(count);

    }
}
