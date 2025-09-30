public class spiy {

    public static void main(String[] args) {
        int num = 123;
        int sum = 0;
        int Product = 1;
        int temp = num;
        while(temp != 0){
            int Digit = temp%10;
            sum += Digit;
            Product *= Digit;
            temp /= 10;
        }
        int TotalN = sum+Product;
        System.out.println(TotalN);
        if(sum == Product){
            System.out.println("The number is Spy number");
        }else{
            System.out.println("The number Not Spy number");
        }
    }
    
}
