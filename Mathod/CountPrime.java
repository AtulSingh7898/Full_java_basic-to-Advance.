import java.util.Scanner;

public class CountPrime {
    public static int countPirmes(int n){
        int isPrime = 1;
        for(int i = 2; i <= n/2; i++){
            if(n%i == 0){
                isPrime = 0;
            }
        }
        return isPrime;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        int count = 0;
        for(int i = 1; i<= n; i++){
            int isPrime = countPirmes(i);
            if(isPrime == 1){
                count++;
            }
            
        System.out.println(n+" "+count);
            
        }
        
    }
}