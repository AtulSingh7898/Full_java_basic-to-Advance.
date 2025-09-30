import java.util.*;

public class Eligible {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the age: ");
        int age = sc.nextInt();

        if(age <= 13){
            System.out.println("Child");
        }else if( age >= 13 && age < 18 ){
            System.out.println("Teen");
        }else{
            System.out.println("Adult");
        }

        // if(age <= 12){
        //     System.out.println("this Is child");
        // }else if(age < 18){
        //     System.out.println("teen ager");
        // }else{
        //     System.out.println("Adutl");
        // }

        // if(age >= 18){
        //     System.out.println("Eligible for Vote ");
        // }else{
        //     System.out.println("can't do vote ");
        // }

    }
}