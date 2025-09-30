import java.util.Scanner;
public class Largest {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int A1 =  sc.nextInt();
        int A2 =  sc.nextInt();
        int A3 =  sc.nextInt();
        int largest = A1;
     if(A2 > largest){
        largest = A2;
     } if(A3 > largest){
        largest = A3;
     }
      System.out.println(largest+" is largest");
    }
}
