import java.util.Scanner;

public class PrintPattern {
    
    static void Printcolom(int col, int maxCol){
        if(col > maxCol){
            return;
        }
        System.out.print("*");
        Printcolom(col+1, maxCol);
    }
    static void Printrows(int row, int maxrow, int maxCal){
        
        if( row > maxCal){
            return;
        }
        
        Printcolom(1,maxrow);
        System.out.println();
        Printrows(row+1, maxrow, maxCal);
        
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int rows = sc.nextInt();
        int col = sc.nextInt();
        Printrows(1, rows, col);
        

        // for(int i = 1; i <= n; i++){
        //     for(int j = 1; j <= m; j++){
        //         System.out.print("*");
        //     }
        //     System.out.println();
        // }

        // int num = 5;
        // int 
        
    }
}
