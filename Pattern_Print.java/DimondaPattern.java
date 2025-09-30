public class DimondaPattern {

//     *
//    * *
//   *   *
//  *     *
// *       *
// *       *
//  *     *
//   *   *
//    * *
//     *

    // static void printspace(int num){
    //     if(num == 0) return;
    //     System.out.print(" ");
    //     printspace(num-1);
    // }

    // static void printstar(int min, int maxNum, int min1, int num){
    //     if(min > maxNum) return;

    //     if(min == 1 || min1 == num || min == maxNum){
    //     System.out.print("*");
    //     }else{
    //         System.out.print(" ");
    //     }
    //     printstar(min+1, maxNum, min1, num);
    // }
    // static void pattern(int min, int num){
    //     if(min > num) return;
    //     printspace(num-min);
    //     printstar(1, 2*min-1,min,num);
    //     System.out.println();
    //     pattern(min+1, num);
    // }


    static void printspace(int num){
        if(num == 0) return;
        System.out.print(" ");
        printspace(num-1);
    }

    static void printstar(int min, int maxNum, int min1, int num){
        if(min > maxNum) return;

        if(min == 1 || min == maxNum){
        System.out.print("*");
        }else{
            System.out.print(" ");
        }
        printstar(min+1, maxNum, min1, num);
    }
    static void pattern(int min, int num){
        if(min > num) return;
        printspace(num-min);
        printstar(1, 2*min-1,min,num);
        System.out.println();
        pattern(min+1, num);
    }

    static void printspace2(int num){
        if(num == 0) return;
        System.out.print(" ");
        printspace2(num-1);
    }
    static void printstar2(int min, int maxNum, int star){
        if(min > maxNum) return;

        // if(min == 1 || min == maxNum){
        //   System.out.print("*");
        // }else{
        //     System.out.print("0");
        // }
        // printstar2(min+1, maxNum,star);
        if(min > maxNum) return;
        if (min == 1 || min == maxNum) {
            System.out.print("*");
        }else{
            System.out.print(" ");
        }
        
        printstar2(min+1, maxNum,star);
    }
    static void pattern2(int min,int odd, int num){
        if(min > num) return;
        printspace2(min-1);
        printstar2(1, 2*num-odd,min);
        System.out.println();
        odd+=2;
        pattern2(min+1,odd, num);
    }
    public static void main(String[] args) {
        int num = 5;
        pattern(1,num);
        pattern2(1,1, num);
//Dimond Pattern

//     *
//    * *
//   *   *
//  *     *
// *       *
//  *     *
//   *   *
//    * *
//     *

        // for(int i = 1; i < num; i++){
        //    for(int j = 1; j <= num-i; j++){
        //     System.out.print(" ");
        //    }
        //    for(int j = 1; j <= 2*i-1; j++){
        //     if(j == 1  || j == 2*i-1){
        //         System.out.print("*");
        //     }else{
        //         System.out.print(" ");
        //     }
            
        //    }
        //    System.out.println();
        // }
        // for(int i = num; i >= 1; i--){
        //    for(int j = 1; j <= num-i; j++){
        //     System.out.print(" ");
        //    }
        //    for(int j = 1; j <= 2*i-1; j++){
        //     if(j == 1  || j == 2*i-1){
        //         System.out.print("*");
        //     }else{
        //         System.out.print(" ");
        //     }
        //    }
        //    System.out.println();
        // }
    // Dimond Pattern
    }
    
}
