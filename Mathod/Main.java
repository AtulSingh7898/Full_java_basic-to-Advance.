import java.util.Scanner;

public class Main{

    static int countNum(int num){
        if(num == 0) return 0;
        return 1+countNum(num/10);
    }
    static int power(int base, int exp){
        if(exp == 0) return 1;
        return base*power(base, exp-1);
    }
    static int armstrongNumber(int num, int numLength){
        if(num == 0) return 0;
        // int digit = num%10;
        // power(num%10, numLength);

        return armstrongNumber(num/10, numLength-1)+power(10, numLength);
    }
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int num = 25;
        int numLength = countNum(num);
        int result = armstrongNumber( num,numLength);
        System.out.println(result);

    }
}