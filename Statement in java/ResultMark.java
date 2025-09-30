import java.util.*;

public class ResultMark {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter You Marks: ");
        int a = sc.nextInt();
         if(a >= 90 && a<= 100){
            System.out.println("You Grade is A+");
            if(a >=94){
                System.out.println("You are Exceptional");
            }else{
                System.out.println("You can DO Just Bit Work, And Next Time achiving this, better luck next Time");
            }
         }else if(a >= 80){
            System.out.println("Your Gread Mark is B+");
        }else if(a >= 70){
            System.out.println("Your Gread Mark is c+");
        }else if(a >= 60){
            System.out.println("Your Gread Mark is d+");
        }else if(a >= 50){
            System.out.println("Your Gread Mark is e+");
        }else{
            System.out.println("Mat karo Padai tumse na Hoga Gaon Jao Or kheti Karo Chat...");
        }
    }
    
}