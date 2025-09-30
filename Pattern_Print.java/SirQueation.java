public class SirQueation {

    //Pyramid  Pattern  using Recursion

/*
 
    *
   ***
  *****
 *******
*********

 */

    public static void printRow(int n,int row){

        if (row>n) {
            return;
            
        }
        printSpaces(n-row);
        printCol(2*row-1);
        System.out.println();
        printRow(n, row+1);
    }

    public static void printSpaces(int space){
        if (space==0) {
            return;
            
        }
        System.out.print(" ");
        printSpaces(space-1);
    }

    public static void printCol(int col){
        if (col==0) {
            return;
            
        }
        System.out.print("*");
        printCol(col-1);


    }

    public static void main(String[] args) {
        int n=5;
        printRow(n,1);
        
    }

    
}
