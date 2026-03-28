package Metrix;

public class main {
    public static void main(String[] args) {

        int[][] metrix = {
            {1,2,3},
            {1,2,3},
            {1,2}
        };

        // the length of row 
        int row =  metrix.length;

        // the length of col
        int col = metrix[2].length;

        System.out.println("The matrix has "+row+" row");
        System.out.println("The matrix has "+col+" col");


    }
    
}
