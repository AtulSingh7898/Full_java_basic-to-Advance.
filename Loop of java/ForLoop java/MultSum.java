import java.util.Scanner;

public class MultSum {
    public static void main(String args[]){
      Scanner sc = new Scanner(System.in);
      System.out.print("Enter The number: ");
      int n = sc.nextInt();

      int sum = 1;

      for(int i = 1; i <= 10; i++){
        System.out.println(n*i);
        sum *= i;

      }
    System.out.print("The some number is: "+sum);
      
  }
}
