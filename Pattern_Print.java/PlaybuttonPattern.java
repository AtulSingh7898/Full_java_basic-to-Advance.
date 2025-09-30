public class PlaybuttonPattern {

    static void pattern(int  n){
        
        for(int row = 1; row <2*n; row++){
            // int totalcolsinrow;
            // if(row > n){
            //     totalcolsinrow = 2*n-row;
            // }else{
            //     totalcolsinrow  = row;
            // }
            int totalcolsinrow = row>n ? 2*n-row : row;

            for(int col = 1; col <= totalcolsinrow; col++){
                System.out.print(col); //"*"
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int number = 3;
        pattern(number);
    }
    
}
