public class DissaniumNum {
    public static void main(String[] args) {
        
        int num = 135;
        int PowerDigit = 0;
        int Module = 0;
        int temp = num;
        
        while (temp != 0) {
            PowerDigit++;
            temp /= 10;
        }
        temp = num;
        while (temp != 0) {
            int Digit = temp%10;
            Module += (int)Math.pow(Digit, PowerDigit);
            PowerDigit--;
            temp /=10;
        }
        if(Module == num){
            System.out.println("The Number is Diserium: ");
        }else{
            System.out.println("The number is not diaserium ");
        }
    }
}
