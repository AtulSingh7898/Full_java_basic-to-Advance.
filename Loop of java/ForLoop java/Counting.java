import java.util.Scanner;

public class Counting {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the first no. ");
        int s =sc.nextInt();
        System.out.print("Enter the sec. no. ");
        int e =sc.nextInt();
        int Even_sum = 0;
        int Odd_sum = 0;
        

        for(int i = s; i <= e; i++){
            if (i%2 == 0) {
                Even_sum += i;
                System.out.println(i+" + ");
                System.out.println("  ");
            }else{
                Odd_sum += i;
                System.out.print(i+" + ");
            }
        }
        int diff = Even_sum - Odd_sum;

        System.out.println(" ="+Even_sum);
        System.out.println(" ="+Odd_sum);
        if(diff%5 == 0){
            System.out.println("Divisible by 5");
        }else{
            System.out.println("Not Divisible by 5");
        }
        System.out.println(diff);
    }
}
