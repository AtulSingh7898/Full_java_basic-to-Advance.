import java.util.Scanner;

public class Spy {

    public static boolean isSpy(int Number){
        int temp = Number;
        int sum = 0;
        int Poduct = 1;
        while (temp != 0) {
            int digit = temp%10;
            sum += digit;
            Poduct *= digit;
            temp /= 10;
        }

        return sum == Poduct;
    }

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int Number = sc.nextInt();
        if(isSpy(Number)){
            System.out.println("the number is spy Number");
        }else{
            System.out.println("The number is not Spy");
        }

    }

    
}
