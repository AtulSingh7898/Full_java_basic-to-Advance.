public class PrymidPattern2 {

    
//     *
//    ***
//   *****
//  *******
// *********

    // static void printspace(int min, int max){
    //     if(min > max){
    //         return;
    //     }
    //     System.out.print(" ");
    //     printspace(min+1, max);
    // }
    // static void printStar(int min, int max){
    //     if(min > max){
    //         return;
    //     }
    //     System.out.print("*");
    //     printStar(min+1, max);
    // }
    // static void printrow(int min, int num){
    //     if(min > num) return;

    //     printspace(1, num-min);
    //     printStar(1, 2*min-1);
    //     System.out.println();
    //     printrow(min+1, num);
    // }



   static void printspace(int min, int max){
        if(min > max){
            return;
        }
        System.out.print(" ");
        printspace(min+1, max);
    }
    static void printStar(int min, int max){
        if(min > max){
            return;
        }
        System.out.print("* ");
        printStar(min+1, max);
    }

    static void printrow(int min, int num){
        if(min > 2*num) return;
        int totalspace;
        if(min > num) {
                totalspace = 2*num-min;
            }
            else {
                totalspace = min-1;
            }
        printspace(1, totalspace);
        int totalcol;
            if(min > num){
                totalcol = min-num;
            }else{
                totalcol = num-min+1;
            }
        printStar(1, totalcol);
        System.out.println();
        printrow(min+1, num);
    }


    public static void main(String[] args) {
        int num = 5;
        printrow(1, num);

//     *
//    ***
//   *****
//  *******
// *********



        // for(int i = 1; i <=num; i++)
       

        // for(int i = 1; i <= 2*num; i++){
        //     int totalspace;
        //     if(i > num) {
        //         totalspace = 2*num-i;
        //     }
        //     else {
        //         totalspace = i-1;
        //     }
        //     for(int j = 1; j <= totalspace; j++){
        //         System.out.print(" ");
        //     }
        //     int totalcol;
        //     if(i > num){
        //         totalcol = i-num;
        //     }else{
        //         totalcol = num-i+1;
        //     }
        //     for(int j = 1; j <= totalcol; j++){
        //         System.out.print("* ");
        //     }

        //     System.out.println();

        // }
    }
    
}
