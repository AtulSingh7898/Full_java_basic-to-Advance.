public class UltaSidhaPattern {

// * * * * * 
//  * * * *
//   * * *
//    * *
//     *
//     *
//    * *
//   * * *
//  * * * *
// * * * * *

    //using recurion
    
    static void printspace(int min, int max){
        if(min > max) return;
        System.out.print(" ");
        printspace(min+1, max);
    }
    static void printCol(int min, int max){
        if(min > max) return;
        System.out.print("* ");
        printCol(min+1, max);
    }
    static void pattern(int start,int num){
        if(start > 2*num) return;
        int maxSpace = (start > num) ? 2*num-start : start-1;
        printspace(1, maxSpace);
        int maxCol = (start > num) ? start-num : num - start+1;
        printCol(1, maxCol);
        System.out.println();
        pattern(start+1, num);
    }
    public static void main(String[] args) {
        int num = 5;
        pattern(1,num);

        for(int i = 1; i <= 2*num; i++){
            //for space
            int maxSpace;
            maxSpace = (i > num) ? 2*num-i : i - 1;
            for(int j = 1; j <=maxSpace; j++){
                
                System.out.print(" ");
            }

            int maxLen;
            //for star
            maxLen = (i > num) ? i-num : num - i+1;
            for(int j = 1; j<= maxLen; j++){
                
                System.out.print("* ");
            
            }
            System.out.println();
        }
    }
}
