public class PrymidPattern {
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
        System.out.print(" *");
        printStar(min+1, max);
    }
    static void printrow(int min, int num){
        if(min > num) return;

        printspace(1, num-min);
        printStar(1, min);
        System.out.println();
        printrow(min+1, num);
    }

    public static void main(String[] args) {
        int num = 5;
        printrow(1, num);

//      *
//     * *
//    * * *
//   * * * *
//  * * * * *
        // for(int i = 1; i <= num; i++){
        //     for(int j = 1; j<=num-i; j++){
        //         System.out.print(" ");
        //     }
        //     for(int j = 1; j <= i; j++){
        //         System.out.print(" *");
        //     }
        //     System.out.println();
        // }
    }
    
}
