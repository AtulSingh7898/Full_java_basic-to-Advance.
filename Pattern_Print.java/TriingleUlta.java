import java.util.*;

public class TriingleUlta {

    static void printStar(int min, int max, int promin, int promax){
        if(min > max) return;
        // if(min == 1|| min == max || promin == 1 || promin == 2*promax)
        // System.out.print("*");
        // else{
        //     System.out.print(" ");
        // }
        System.out.print(" ");
        printStar(min+1, max,promin,promax);
    }
    // static void printStar2(int min, int max, int promin, int promax){
    //     if(min > max) return;
    //    if(min == 1|| min == max || promin == 1 || promin == 2*promax)
    //     System.out.print("*");
    //    else{
    //     System.out.print(" ");
    //     }
    //     // System.out.print("*");
    //     printStar2(min+1, max,promin,promax);
    // }
   
   static void printrows(int min, int max){
    if(min > 2*max) return;
    int printStar = (min > max) ? min-max : max-min;
    int space = (min > max) ? 2*max-min :  min;
    
    printStar(1, printStar, min, max);
    printSpace(1, space);
    // printStar2(1, printStar, min, max);
    System.out.println();
    printrows(min+1, max);
   }
   static void printSpace(int min, int max){
        if(min > max) return;
        if(min == 1 || min == max){
            System.out.print("* ");
        }
        else{
            System.out.print("  ");
        }
        
        printSpace(min+1, max);
    }
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        // System.out.println("Enter the number");
        // int rows = 5;
        // int col = sc.nextInt();
        int num = 6;
        
        printrows(1, num);


    }

}    
        // for(int i = 1; i <= 2*num; i++){
        //     int star1 = (i > num) ?  2*num-i+1: i;
        //     for(int j = 1; j <= star1; j++){
        //         if(j == 1 || j==star1 ){
        //             System.out.print("* ");
        //         }else{
        //             System.out.print("  ");
        //         }
        //     }
        //     //
        //     int space = (i > num) ? i - num : num-i+1;
        //     for(int j = 1; j< space; j++){
        //         System.out.print("    ");
        //     }
            
        //     int star2 = (i > num)?  2*num-i+1: i;
        //     for(int j = 1; j <= star2; j++){
        //         if(j == 1 || j==star2 ){
        //             System.out.print("* ");
        //         }else{
        //             System.out.print("  ");
        //         }
                
        //     }
        //     System.out.println();
        // }
    // }

//}
    

