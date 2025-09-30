public class playbutton {
    // Numerical Print
// 1 
// 1 2
// 1 2 3
// 1 2
// 1
    // static void printCol(int start, int end){
    //     if(start > end) return;
    //     System.out.print(start+" ");
    //     printCol(start+1, end);
    // }
    // static void printrow(int start , int maxValue){
    //     if(start > maxValue*2) return;
    //     int maxLength = (start > maxValue) ?  (2*maxValue-start) : start; 
    //     printCol(1, maxLength);
    //     System.out.println();
    //     printrow(start+1, maxValue);
    // }

// star print
//  * 
//  *  *
//  *  *  *
//  *  *
//  *     
    static void printCol(int start, int end){
        if(start > end) return;
        System.out.print(" * ");
        printCol(start+1, end);
    }
    static void printrow(int start , int maxValue){
        if(start > maxValue*2) return;
        int maxLength = (start > maxValue) ?  (2*maxValue-start) : start; 
        printCol(1, maxLength);
        System.out.println();
        printrow(start+1, maxValue);
    }
   public static void main(String[] args) {

    int num = 3;
    printrow(1, num);
    // for(int i = 1; i < num*2; i++){
    //     int maxLength = (i > num) ? 2*num-i : i;  
    //     for(int j = 1; j <=maxLength; j++){
    //         System.out.print(" * ");
    //     }
    //     System.out.println();
    // }

    }
    
}
