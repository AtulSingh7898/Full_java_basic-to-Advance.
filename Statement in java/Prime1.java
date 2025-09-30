import java.util.Scanner;
//count number of difits

public class Prime1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
         int n = sc.nextInt();
         int Reverse = 0;

         for(int i = n; i != 0; i /=10){
            int Digit = i%10;
            Reverse = Reverse*10+Digit;
            
        }
        if(n==Reverse){
                System.out.println(n+" it is a pelindram number");
           }else{
            
            System.out.println(n+" it is not a pelindram number");
           }
         
        // while(n>0){


        //     s = n%10;
        //     System.out.print(s);

        //     n = n/10;
        // }
        // System.out.println(s);

        // for(int)

        // System.out.println("Enter Any no. ");
        // int n = sc.nextInt();
        // // int n = 34;
        // int count = 0;
        // // if(i%2 == 0)
        // for(int i = n; i != 0; i /=10){
        //     count++;
        //     // System.out.println(c);
        // }
        // System.out.println(count);
    }
    
}
