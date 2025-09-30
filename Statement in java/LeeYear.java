import java.util.*;

public class LeeYear {

    public static void main(String args[]){

        Scanner sc = new Scanner(System.in);
        int year = sc.nextInt();;

        if((year%400 == 0) || (year!=100 && year%4 ==0 )){     
            System.out.print("The Year Is Leap year: ");
        }else{
            System.out.println("The year Is Not Leap");
        }
    }
}