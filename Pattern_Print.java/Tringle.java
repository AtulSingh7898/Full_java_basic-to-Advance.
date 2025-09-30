import java.util.Scanner;

public class Tringle {
    
    static void Printcolom(int col, int maxCol){
        if(col > maxCol){
            return;
        }
        System.out.print(col+" ");
        Printcolom(col+1, maxCol);
    }

    static void Printrows(int row, int maxrow){
        int i = 1;
        if( row > maxrow){
            return;
        }
        
        Printcolom(1,row);
        System.out.println();
        Printrows(row+1, maxrow);
        
    }

    
    

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int rows = sc.nextInt();
        int col = sc.nextInt();
        Printrows(1, rows);
        

        // for(int i = 1; i <= n; i++){
        //     for(int j = 1; j <= i; j++){
        //         System.out.print("*");
        //     }
        //     System.out.println();
        // }

        // int num = 5;
        // int 
        
    }
}
