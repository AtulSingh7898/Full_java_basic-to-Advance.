import java.util.Scanner;
public class PrintPatterPractic{

    static void printcol(int col, int maxcol){
        if(col > maxcol){
            return;
        }
        System.out.print("*");
        printcol(col+1, maxcol);
    }
    
    static void printrow(int row, int maxrow){
        if(row > maxrow){
            return;
        }

        printcol(1,row);
        System.out.println();
        printrow(row+1, maxrow);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int row = sc.nextInt();
        // int col = sc.nextInt();

        printrow(1, row);

    }
}
