import java.util.Scanner;

public class Tempreture {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Tempreture: ");
        int x = sc.nextInt();

        if(x < 15){
            System.out.println("Its Cold");
        }else if(x >= 15 && x <= 30){
            System.out.println("Warm");
        }else{
            System.out.println("Hot: Hath Jal Jayega");
        }
    }
}
