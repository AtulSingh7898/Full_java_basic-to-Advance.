import java.util.Scanner;

public class AddNum {

    public static int addNum(int num1, int num2){
        int sum = num1+num2;
        return sum;

        
    }
    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);
        System.out.println("Enter the number");
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        int result = addNum(num1, num2);
        System.out.println(result);
        
        

    }
    
}
