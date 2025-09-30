import java.util.Scanner;

public class CharUp {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Aphabate: ");
        char ch = sc.next().charAt(0);

        if(ch >= 'a' || ch <= 'z'){
            if(ch>='A'|| ch<='B'){
                System.out.println(ch);
            }
        }
    }
    
}
