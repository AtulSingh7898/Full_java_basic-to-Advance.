import java.util.Scanner;

public class Ques30 {

    public static void main(String arga[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter any Value: ");
        char ch = sc.next().charAt(0);

        if ((ch >= 'a') && (ch < 'z' )|| (ch >= 'A') && (ch <= 'Z')) {
            if ((ch == 'a') || (ch == 'e') || (ch == 'i') || (ch == 'o') || (ch == 'u') ||
                    (ch == 'A') || (ch == 'E') || (ch == 'I') || (ch == 'O') || (ch == 'U')) {
                System.out.println("Vowel");
            } else {
                System.out.println("Consonents");
            }
        } else if ((ch >= '0') && (ch <= '9')) {
            System.out.println("Digit");
        } else {
            System.out.println("spacial ");
        }
    }

}
