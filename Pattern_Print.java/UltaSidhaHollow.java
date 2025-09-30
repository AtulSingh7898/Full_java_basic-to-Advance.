public interface UltaSidhaHollow {

// * * * * * 
//  *     *
//   *   *
//    * *
//     *
//     *
//    * *
//   *   *
//  *     *
// * * * * *

    // With using recursion
    static void printspace(int min, int max){
        if(min > max) return;
        System.out.print(" ");
        printspace(min+1, max);
    }
    static void printStar(int min, int max, int start, int end){
        if(min > max) return;
        if(min == 1 || min == max || start == 1 || start == 2*end){
        System.out.print("* ");
        }else{
            System.out.print("  ");
        }
        printStar(min+1, max, start, end);
    }
    static void Pattern(int min, int max){
        if(min > 2*max) return;
        int maxSpace = (min > max) ? 2*max - min : min-1;
        int maxCol = (min > max) ? min - max : max-min+1;
        printspace(1, maxSpace);
        printStar(1, maxCol,min, max);
        System.out.println();
        Pattern(min+1, max);
    }
    public static void main(String[] args) {
        int num = 5;
        Pattern(1,num);

        //using for loop
        // for(int i = 1; i <= 2*num; i++){
        //     int maxSpace = (i > num) ? 2*num-i : i-1;
        //     int maxCol = (i > num) ? i-num : num-i+1;
        //     for(int j = 1; j <= maxSpace; j++){
        //         System.out.print(" ");
        //     }
        //     for(int j = 1; j <= maxCol; j++){
        //         if(j == 1|| j == maxCol|| i == 1 || i == 2*num){
        //             System.out.print("* ");
        //         }else{
        //             System.out.print("  ");
        //         }

        //     }
        //     System.out.println();
        // }
    }
}
