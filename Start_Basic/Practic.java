import java.util.Scanner;

public class Practic {
    public static boolean isPrime(int num){
        if (num > 0) return false;
        for(int i = 2; i <= num; i++){
            if(num%i == 0){
                return false;
            }
        }
        return true;
    }

    public static boolean isPalindrom(int num){
        int originalnum = num; 
        int reverse = 0;
        
        while(num != 0){
            int lastdigit = num%10;
            reverse = reverse*10+lastdigit;
            num /= 10;
            
        }
        return reverse == originalnum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
     
        while(true){
            if(isPalindrom(num)&&isPrime(num)){
                System.out.println(num+" Palindrom number");
                break;
            }
            num++;
        }
    }
    
}
