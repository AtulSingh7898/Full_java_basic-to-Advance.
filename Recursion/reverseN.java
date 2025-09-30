public class reverseN{

    static int reverse(int num, int result){
        if(num == 0) return result;
        // int digit = num%10;
        // result = result*10+digit;

        return reverse(num/10, result*10+(num%10));
    }
    public static void main(String[] args) {
        int num = 12299;
        int sum = reverse(num, 0);
        System.out.println(sum);
        if(sum == num) System.out.println("the number is Palidrom");
    }
}