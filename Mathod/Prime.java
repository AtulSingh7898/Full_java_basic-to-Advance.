import java.util.Scanner;
public class Prime {

    public static boolean isPrime(int Prime){
      
        boolean isPrime = true;
        for(int i = 2; i<=Prime/2; i++){
            if(Prime%i == 0){
                isPrime = false;
                return isPrime;
            }
        }
        return isPrime;
        
    }

    public static void main(String args[]){
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
         int Prime = sc.nextInt();
        if(isPrime(Prime)){
            System.out.println("The number is Prime ");
        }else{
            System.out.println("The is non Prime");
        }
    }
    
}
