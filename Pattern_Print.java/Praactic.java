public class Praactic {

    // static int palindromNum(int num,int result){
    //     if(num == 0) return 0;
    //     // result = result;
    //     int digit = num%10;
    //     return result+palindromNum(num/10, result*10+digit);
    // }
    static int palindromNum(int num, int result){
        if(num == 0) return result;
        // int digit = num%10;
        // result = result*10+digit;

        return palindromNum(num/10, result*10+(num%10));
    }

    static boolean isPalidrom(int num1, int show){
        int num = palindromNum(num1, show);
        if(num1 == num){
            return true;
        }
        return false;
    }
    
    public static void main(String[] args) {

        int num1 = 1271;

        boolean result = isPalidrom(num1,0);
        System.out.println(result);

        // reverse number
    //     int count = 0;
    //     for(int i = 1; i <= 1000; i++){
    //     int num = i;
    //     int result = 0;
    //     int temp = num;
    //     while(temp != 0){
    //         int digit =  temp%10;
    //         result = result*10+digit;
    //         temp /=10;
            
    //     }
        
    //     if(result == num){
    //         if
    //         count++;
    //     }
    // }
    // System.out.println(count);
        
        
    }
    
}
