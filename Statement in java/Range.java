import java.util.Scanner;
public class Range {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int a = 10;
        int b = 20;
        if(a <= x && b >= x) {
            System.out.println("in the range");
        }else{
            System.out.println("Out of Range");
        }
    }
}
