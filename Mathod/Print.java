import java.util.Scanner;

public class Print {
    static void printspace(int start, int num){
        if(start > num) return;
        System.out.print(" ");
        printspace(start+1, num);
    }

     static void printstar(int start, int num){
        if(start > num) return;
        System.out.print("*");
        printstar(start+1, num);
    }
    static void pattern(int start, int num){
        if(start > num) return;
        printspace(1, num-start);
        printstar(1, 2*start-1);
        System.out.println();
        pattern(start+1, num);
    }

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int num = 5;
        pattern(1,num);

        for(int i = 1; i <= num; i++){
            // int star = (i > num) ? 2*num-i : i-1+1;
            // int star = (i > num) ? 2*num-i : i-1+1;
            for(int j = 1; j <= i; j++){
                System.out.print(" ");
            }
        
            for(int j = 1; j <=2*num-2*i-1; j++){
                System.out.print("*");
            }
            System.out.println();
        }
       
        

    }
    
}
