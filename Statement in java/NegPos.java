import java.util.Scanner;

public class NegPos {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Number: ");
        int n = sc.nextInt();

        // if(n > 0){
        //     System.out.println("The Number "+n+" is positive: ");
        // }else if(n<0){
        //     System.out.println("The Number "+n+" is Nagetive: ");
        // }else{
        //     System.out.println("The Number is zero");
        // }

        // int ans;
        // if(n > 0) {
        //     System.out.println("positve");
        // }else if(n < 0 ){
        //     System.out.println("negetive");
        // }else{
        //     System.out.println("zero");
        // }

        if(n>0){
            if(n%2 == 0){
                System.out.println("Possitive and Even");
            }else{
                System.out.println("Positive and odd");
            }
        }else if(n<0){
            if(n%2 == 0){
                System.out.println("Negetive and even");
            }else{
                System.out.println("Negetive and odd");
            }
        }else{
            System.out.println("The number is zero");
        }

    }
}
