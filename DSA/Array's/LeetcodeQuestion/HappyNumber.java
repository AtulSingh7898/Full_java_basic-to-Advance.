// package LeetcodeQuestion;

public class HappyNumber {
    public static void main(String[] args){
        int n = 536;
        
        while(true){
 
        int result = 0;
        int temp = n;
        while(temp != 0){
            int  product = 1;
            int digit = temp%10;
            for(int i = 1; i <= 2; i++){
                product *= digit;
            }
            result += product;
            temp /=10;
        }
         if(result == 1){
            System.out.println(result);
            System.out.println(true);
            break;
        }
        //  else {
        //     System.out.println(false);
        //     break;
        // }
    }
        // System.out.println(result);
        // int result2 = 0;
        // int temp1 = result;
        // while(temp1 != 0){
        //     int  product = 1;
        //     int digit = temp1%10;
        //     for(int i = 1; i <= 2; i++){
        //         product *= digit;
        //     }
        //     result2 += product;
        //     temp1 /=10;
        // }
        // System.out.println(result2);
        // int result3 = 0;
        // int temp2 = result2;
        // while(temp2 != 0){
        //     int  product = 1;
        //     int digit = temp2%10;
        //     for(int i = 1; i <= 2; i++){
        //         product *= digit;
        //     }
        //     result3 += product;
        //     temp2 /=10;
        // }
        // temp = result3;
        // int result4 = 0;

        // while(temp != 0){
        //     int  product = 1;
        //     int digit = temp%10;
        //     for(int i = 1; i <= 2; i++){
        //         product *= digit;
        //     }
        //     result4 += product;
        //     temp /=10;
        // }
        // // System.out.println(result3);
        // if(result4 == 1){
        //     System.out.println(true);
        // } System.out.println(false);
    }
    
}
