import java.util.Scanner;
public class Breack {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        // for(int i = 1; i <= 3; i++){
        //     for(int j = 1; j <=3; j++ ){
        //         if(j == 3 || i == 3){
        //             continue;
                    
        //         }
        //         System.out.println(i+" "+j);
        //     }
            
        // }

        // skip using continue;

        // for(int i = 1; i <= 100; i++){
        //     if(i%3 != 0){
        //         continue;
        //     }
        //      System.out.println(i);
           
        // }

        //palindrom no.;
        int s = sc.nextInt();
        int n1 = sc.nextInt();
        
        System.out.println("All pelindrom Number 1 to 1000 are: ");
        int count = 0;
        for(int j = s; j<=n1; j++){
        
        int n = j;
        int reverse = 0;
        for(int  i = n; i>= 1; i /= 10){
            int last = i%10;
            reverse = reverse*10+last;
        }
        if(reverse == n){
            if(reverse%111 == 0){
            // System.out.print(reverse+" ");
            count++;
            
        }
        
        } 
         
    }
    System.out.println(count);       
    }
    
}
