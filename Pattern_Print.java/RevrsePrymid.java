public class RevrsePrymid {

//  *********
//   *******
//    *****
//     ***
//      *

    static void printSpace( int max){
        if(max == 0) return;
        System.out.print(" ");
        printSpace( max-1);
    }
    static void printStar( int max){
        
        if(max == 0) return;
        System.out.print("*");
    
        printStar(max-1);
    }
    static void printrow(int min, int max, int odd){
        
        if(min>max) return;
        printSpace(min);
        printStar (2*max-odd);
        System.out.println();
        printrow(min+1, max, odd+2); 
    }
    public static void main(String[] args) {
        int num = 5;
        printrow(1, num,1);
        // printrow(1, num);
        // for(int i = num; i >= 1; i--){
        //     for(int j = 1; j <= num-i; j++){
        //     System.out.print(" ");
        //     }
        //     for(int j = 1; j <= 2*i-1; j++){
        //         System.out.print("*");
        //     }
        //     System.out.println();
        // }
    }
    
}
