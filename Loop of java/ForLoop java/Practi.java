import java.util.Scanner;

public class Practi {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int count = 0;
        // int[] number = new int[5];
        // for(int i = 1; i <=5; i++){
        //     number[i] = sc.nextInt();
        // }

        // for(int i = 1; i <= 6; i++){
        //     number[i] = sc.nextInt();
        //     if(number[i] == 0){
                    
        //             break;
        //         }
        
        //     if(number[i]%5 == 0){ 
        //         count++;
        //         System.out.println(i+"");
        //     }
        // }
        // System.out.println(" = "+count);
        
        for(;;){
            int num = sc.nextInt();
            
            if(num < 0){
                continue;
            }
            System.out.print(num+" ");
        }
        
          
        
        
    
    }
}
