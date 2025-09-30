import java.util.Scanner;

public class HarshdNum {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = 12;
        int temp = n;
        int digitSum = 0;

        while(temp != 0){
            int digit = temp %10;
            digitSum += digit;
            temp /= 10;
        }
        if(n%digitSum == 0){
            System.out.println("Its Harshad Number: ");
        }else{
            System.out.println("Its not Harshad Number: ");
        }
    
    }
}
