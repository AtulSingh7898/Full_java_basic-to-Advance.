public class PlayButPattern2 {
    static void printcol(int start , int end){

        if(start == end){
            return;
        }
        System.out.print(start+" ");
        printcol(start+1, end);
    }

    static void patternrow(int row, int n){
        if( row == 2*n){
            return;
        }

        // int totalcolsinrow;
        //     if( > maxRow){
        //         totalcolsinrow = 2*row-maxRow;
        //     }else{
        //         totalcolsinrow  = row;
        //     }

        int totalcolsinrow = row>n ? 2*n-row : row;
        System.out.println();
        printcol(1, totalcolsinrow);
        patternrow(row+1, n);

        
        
    }
    
    public static void main(String[] args) {
        int n = 8;
        patternrow(1,n);
    }
  }

