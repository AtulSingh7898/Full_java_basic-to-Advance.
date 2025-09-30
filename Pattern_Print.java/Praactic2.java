public class Praactic2 {

    static void printspace(int col, int mincol){
        if(col == mincol) return;
        System.out.print(" ");
        printspace(col-1, mincol);
    }
    static void printnum1(int col, int mincol){
        if(col== mincol) return;
        System.out.print("*");
        printnum1(col-1, mincol);
    }
    static void printdisNum2(int col, int maxcol){
        if(col > maxcol) return;
        
        System.out.print("*");
        printdisNum2(col+1, maxcol);
        
    }
    static void Printrow(int row, int maxrow){
        if(row > maxrow){
            return;
        }
        printspace(maxrow-row, 0);
        printnum1(row, 0);
        printdisNum2(2, row);
        System.out.println();
        Printrow(row+1, maxrow);

    }
    public static void main(String[] args) {
        //Palidrom Tringular
        Printrow(1, 6);

        // int num = 4;
        // for(int i = 1; i <= num; i++){

        //     for(int j = num-i; j >= 1; j--){
        //         System.out.print(" ");
        //     }
        //     for(int j = i; j >= 1; j--){
        //         System.out.print(j);
        //     }

        //     for(int j =2; j <= i; j++){
        //         System.out.print(j);
        //     }
        //     System.out.println();
        // }
    }
    
}
