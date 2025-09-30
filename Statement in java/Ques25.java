import java.util.Scanner;

public class Ques25 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Your Gread: ");
        int a = sc.nextInt();

        if(a >= 80){
            System.out.println("Gread A");
        }else if(a >= 70){
            System.out.println("Gread B");
        }else{
            System.out.println("pass");
        }
    }
}
