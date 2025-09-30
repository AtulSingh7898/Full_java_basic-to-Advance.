import java.util.Scanner;


public class NextNum {
   public static void main(String []args){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();

    if(n%2 == 0){
        n+=2;
        System.out.println("Next Even = "+n);
    }else{
        n= n+1;
        System.out.println("Next Even = "+n);
        
    }
   }
    
}
