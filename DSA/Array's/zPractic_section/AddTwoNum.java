public class AddTwoNum {
    static int addNumber(int nums){
        int temp = nums;
        int result = 0;
        while(temp != 0){
            int digit = temp%10;
            result = result*10+digit;
            temp /= 10;
        }

        return result;
    }
    
    public static void main(String[] args){
        int num = 243;
        int num2 = 564;
        int add1 = addNumber(num);
        int add2 = addNumber(num2);
        int preResult  = add1+add2;
        int result = addNumber(preResult);
        System.out.println(result);
        
    }
}
