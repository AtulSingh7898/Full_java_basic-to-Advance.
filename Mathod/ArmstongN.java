import java.util.Scanner;

public class ArmstongN {

    public static int armStrong(int Number){
        int temp = Number;
        int countPower = 0;
        int result = 0;

        while (temp != 0) {
            temp/=10;
            countPower++;
        }
        temp = Number;
        while (temp != 0) {
            int digit = temp%10;
            result+=(int)Math.pow(digit, countPower);
            temp /= 10;
        }
        return result;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number ");
        int Number = sc.nextInt();
        int result = armStrong(Number);
        if(result == Number){
            System.out.println("The number is Armsstrong number");
        }else{
            System.out.println("The number is not armstong number");
        }
    }
    
}
