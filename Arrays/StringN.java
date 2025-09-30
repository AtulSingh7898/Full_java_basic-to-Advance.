import java.util.Scanner;

public class StringN {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
    
        System.out.print("Entet any Name: ");
        String input = sc.nextLine();
        
        for(int i = 0; i<=input.length(); i++){
            char ch = input.charAt(i);
            if((ch == 'a') || (ch == 'e') || (ch == 'i') || (ch == 'o') || (ch == 'u')||
            (ch == 'A') || (ch == 'E') || (ch == 'I') || (ch == 'O') || (ch == 'U')){
                continue;
        }
        System.out.print(ch);

        }
    }
}
