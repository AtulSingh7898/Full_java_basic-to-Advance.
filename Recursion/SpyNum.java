public class SpyNum {

    public static int SpyNum2(int num, int reasult){
        if(num == 0) return 1;

        // int digit = num%10;
        // int reasult += digit;
        return num%10*SpyNum2(num/10, reasult);
    }
    
    public static int SpyNum(int num, int reasult){
        if(num == 0) return 0;

        // int digit = num%10;
        // int reasult += digit;
        return num%10+SpyNum(num/10, reasult);
    }

    // public static boolean spyNumSUm(int num){
    //     if(num == 0){
    //         return true;
    //     }
    //     int SpyNum = SpyNum(num, 0);
    //     int SpyNum2 = SpyNum2(num, 1);

    //     if (SpyNum == SpyNum2) {
    //         return true;
    //     }
    //     return spyNumSUm(num/10);
    // }

    public static void main(String[] args) {

        int num = 123;
        int SpyNum = SpyNum(num, 0);
        int SpyNum2 = SpyNum2(num, 1);

        // boolean spy = spyNumSUm(num);

        if(SpyNum == SpyNum2){
            System.out.println("The number is Spy Num");
        }else{
            System.out.println("The number is not spy number");
        }
        
    }
}
