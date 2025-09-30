import java.util.Scanner;

public class Ques31 {
    public static void main(String args[]){
        Scanner sc  = new Scanner(System.in);

        char ch = sc.next().charAt(0);
        if(ch == '$'){
            System.out.println("USA");
        }else{
            System.out.println("Other correnacy");
        }
    }
}
