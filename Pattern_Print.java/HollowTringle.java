public class HollowTringle {
//     *
//    * *
//   *   *
//  *     *
// *********

   static void printspace(int min, int max){
    if(min > max) return;
    System.out.print(" ");
    printspace(min+1, max);
   }

   static void printcol(int min1, int min, int max, int num){
     if(min1 > max) return;
    if(min1 == 1 || min == num || min1 == max){
        System.out.print("*");
    }else{
        
         System.out.print(" ");
        // if(min1%2 == 0){
        //     System.out.print("1");
        // }
        // else{
        //     System.out.print("0");
        // }    
    }
    printcol(min1+1, min, max, num);
   }
   static void printrow(int min, int max){
      if(min > max) return;
      printspace(1 , max-min);
      printcol(1,min, 2*min-1, max);
      System.out.println();
      printrow(min+1, max);
   }

    
    public static void main(String[] args) {
        int num = 5;
        printrow(1, num);

        //row
        // for(int i = 1; i <= num; i++){
        //     //spacecol
        //     for(int j = 1; j <= num - i; j++){
        //         System.out.print(" ");
        //     }
        //     //star col
        //     for(int j = 1; j <= (2*i - 1); j++){
        //         if(j == 1 || i == num || j == (2*i - 1) ){
        //             System.out.print("*");
        //         }else{
        //             System.out.print(" ");
        //         }
        //     }
        //     System.out.println();
        // }
    }
    
}
