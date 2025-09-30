public class DiseriumNumber {

    static int power(int base, int exp){
        if(exp == 0) return 1;

        return base*power(base, exp - 1);
    }
    static int countDigit(int num){
        if(num == 0){
            return 0;
        }
        return 1+countDigit(num/10);
    }

    public static int DiseriumNumber(int num, int pos){
        if(num == 0){
            return 0;
        }
        int digit = num%10;
        int sum = power(digit, pos);

        return DiseriumNumber(num/10, pos-1)+sum;
    }
    public static void main(String args[]){
        int num = 135; 
        int length = countDigit(num);
        int sum = DiseriumNumber(num, length);
        System.out.println(sum);
    }
}
