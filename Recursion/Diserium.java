public class Diserium {

    public static int Power(int base, int exp) {
        if (exp == 0) {
            return 1;
        }
        return base * Power(base, exp - 1);
    }

    public static int countDigit(int n) {
        if (n == 0) {
            return 0;
        }
        return 1 + countDigit(n / 10);
    }

    public static int DiseriumN(int n, int pos) {
        if (n == 0) return 0;
        
        int digit = n % 10;
        int sum = Power(digit, pos); // Fix here: should use digit, not n
        return DiseriumN(n / 10, pos - 1) + sum; // decrement position as you move left
    }

    public static void main(String[] args) {
        int n = 135;
        int len = countDigit(n); // get number of digits for position
        int sum = DiseriumN(n, len);
        System.out.println(sum);
        // if (sum == n) {
        //     System.out.println("The number is diserium");
        // } else {
        //     System.out.println("The number is not diserium");
        // }
    }
}
