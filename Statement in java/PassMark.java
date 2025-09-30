import java.util.Scanner;


public class PassMark {
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Student Marks: ");
        int a = sc.nextInt();
        
        if(a >= 33){
            System.out.println("Passed");
        }else{
            System.out.println("Faild");
        }
        
    }
}
