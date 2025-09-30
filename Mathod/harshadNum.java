import java.util.Scanner;


public class harshadNum {

    public static int isHarsh(int n){
        int temp = n;
        int result = 0;
        while(temp != 0){
            int Digit = temp%10;
            result += Digit;
            temp /= 10;
        }
         return result;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();   
        int result = isHarsh(n);
        if(n%result == 0){
            System.out.println("the number is Harshad Number");
        }else{
            System.out.println("The number is Not Harshad ");
        }
        
    }
}
