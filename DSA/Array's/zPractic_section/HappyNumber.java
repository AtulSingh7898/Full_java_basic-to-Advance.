public class HappyNumber{
    public static void main(String[] args){
        int nums = 1111111;
        int result = 0;
        int temp = nums;
        while(true){
        result = 0;
        while(temp != 0){
            int  product = 1;
            int digit = temp%10;
            for(int i = 1; i <= 2; i++){
                product *= digit;
            }
            result += product;
            temp /=10;
        }
        temp = result;
        if(result == 1){
                System.out.println(true);
                System.out.println(result);
                break;
            }else if(result > 2 && result < 10){
                System.out.println(false);
                System.out.println(result);
                break;
            }
        }
    }
}