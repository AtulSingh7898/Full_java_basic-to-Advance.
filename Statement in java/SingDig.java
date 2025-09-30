import java.util.Scanner;
public class SingDig {
    public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    
    System.out.print("Enter the number: ");
    int x = sc.nextInt();
    if(10 > x){
        System.out.println(x+" is single Digit");
    }else{
        System.out.println("Double Digit");
    }
    }
    
}
