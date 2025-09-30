public class KaprakerNum {
    
    public static int Power(int base, int exp){
        if(exp == 0){
            return 1;
        }
         return base*Power(base, exp-1);
    }

    public static int countDigit(int n){
        if (n == 0) {
            return 0;
        }
        return 1+countDigit(n/10);
    }

    // public static boolean KaprakerN(int num){
    //     if(num == 1){
    //         return true;
    //     }
        // int Square = num*num;
        // int digit = countDigit(Square);
        // for(int i = 1; i < digit; i++){
        //     int divisior = Power(10, i);
        //     int rightPart = Square%divisior;
        //     int leftPart = Square/divisior;
        //     if(rightPart !=0 && (leftPart+rightPart == num)){
        //     return true;
        //     }
        //     return false;
        // }

    public static boolean isKaprakerN(int num, int Square){
        if(num == 1){
            return true;
        }
        Square = num*num;
        int digit = countDigit(Square);
        for(int i = 1; i < digit; i++){
            int divisior = Power(10, i);
            int rightPart = Square%divisior;
            int leftPart = Square/divisior;

            if(rightPart !=0 && (leftPart+rightPart == num)){
            return true;
            }
        }

        // return  KaprakerN(num/10,);
        return false;
        
    }

    public static void main(String[] args) {
        int num = 56;
        // int Square = num*num;
        boolean reasult = isKaprakerN(num, 1);
        if(reasult){
            System.out.println("The number is Kaprekaer no");
        }else{
            System.out.println("The number is Not Kaprekaer no");
        }
        
    }
}
