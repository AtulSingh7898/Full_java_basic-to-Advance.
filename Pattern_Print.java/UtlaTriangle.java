public class UtlaTriangle {
    // Reverse Triangle
// *********
//  *     *
//   *   *
//    * * 
//     * 
    static void  printspace(int max){
        if(max == 0) return;
        System.out.print(" ");
        printspace( max-1);
    }
    static void  printCol(int min, int max, int startNum){
        if(min > max) return;
        if (min == 1 || min == max || startNum == 1) {
            System.out.print("*");
        }else{
            System.out.print(" ");
        }
        
        printCol(min+1, max, startNum);
    }
    static void printPattern(int min,int odd, int max){
        if(min > max) return;
        printspace(min-1);
        printCol(1, 2*max-odd, min);
        System.out.println();
        odd += 2;
        printPattern(min+1,odd, max);
    }
    public static void main(String[] args) {
        int num = 5;
        printPattern(1,1, num);
    }
    
}
