public class NumTringuler {

    static void printCol(int col, int maxCol){
        // 1
        // 0 1
        // 1 0 1
        // 0 1 0 1
        // 1 0 1 0 1
        
        if(col > maxCol) return;
        if((col+maxCol)%2 == 0){
            System.out.print(" 1");
        }else{
            System.out.print(" 0");
        }
        // System.out.print(col+" ");
        printCol(col+1, maxCol);
    }

    static void printHollow(int row, int maxrow){
        if(maxrow < row) return;

        printCol(1, row);
        System.out.println();
        printHollow(row+1, maxrow);
    }
    public static void main(String[] args) {
        //hollow Pattern
        int num = 5;
        printHollow(1,num);

    }
    
}
