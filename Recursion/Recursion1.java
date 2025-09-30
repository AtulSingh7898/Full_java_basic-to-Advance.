public class Recursion1 {

    public static int reverse(int num,int rev) {
        if (num == 0) {
            return rev;

        }
        int lastDigit=num%10;
        rev=rev*10+lastDigit;

        return reverse(num/10, rev);
    }

    public static boolean isPalindrome(int num){
        int reverse = reverse(num,0);
        return reverse==num;
    }
 public static void main(String[] args) {
        int num = 5682;
        boolean isPalindrome=isPalindrome(num);

        if (isPalindrome) {
            System.out.println("Yes it is a palindrome Number");
            
        }else{
            System.out.println("No it is not a palindrome Number");
            
        } 
 }   
}
