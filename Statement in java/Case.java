import java.util.Scanner;

public class Case {
    Scanner sc = new Scanner(System.in);
    
    public static void main(String args[]){
        char ch = 50;
        if (ch >='A' && ch <= 'Z') {
            System.out.println(" Upercase Alphabate: ");
        }else if(ch >= 'a' && ch <= 'z'){
            System.out.println("Its Lower case");
        }else{
            System.out.println("Its Spacial Character ");
        }
    }
}
