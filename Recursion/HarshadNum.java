public class HarshadNum {
    public static int HarshadNum(int num){
        if(num == 0){
            return 0;
        }
        // if(num%10 != Square%10){
        //     return false;
        // }
        // int digit = num%10;
        // sum = sum+digit;
        return num%10+HarshadNum(num/10);
    }

    public static void main(String[] args) {
        
        int num = 18;
        // int Square = num*num;
        int result = HarshadNum(num);
        if(num%result == 0){
            System.out.println("it is Harshad Number");
        }else{
            System.out.println("The number not is Harshad");
        }
        // System.out.println(result);
    }
    
}
