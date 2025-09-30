import java.util.Scanner;

public class PrinNumPatter {

    static void Printcolom(int col){
        if(col == 0){
            return;
        }
        System.out.print(col+" ");
        Printcolom(col-1);
    }

    static void Printrows(int row, int maxrow){
        int i = 1;
        if( row > maxrow){
            return;
        }
        
        Printcolom(maxrow-row+1);
        System.out.println();
        Printrows(row+1, maxrow);
        
    }


    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int rows = sc.nextInt();
        // int col = sc.nextInt();
        Printrows(1, rows);
        // int num = 5;
            int num = 4;
            
        // for(int i = num; i >= 1; i--){
        //     for(int j = 1; j <= i; j++){
        //         System.out.print(j+" ");
        //     }
        //     System.out.println();
        // }
    
    }
}
