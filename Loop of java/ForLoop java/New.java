
public class New {
    public static void main(String[] args) {
        int number = 25;
       int flag = 1;
        // System.out.println(number);

        for(int i = 2; i <= number/2; i++){
            // System.out.println("i value is : "+ i);
            // System.out.println("Runs if true : "+(number%i == 0) );
            if(number%i == 0){
                flag = 0;
                break;
            }
            // System.out.println("Is prime State is : "+ isPrime);
        }

        if (flag == 1) {
            System.out.println("It is a prime number");
            
        }else{
            System.out.println("It is not a prime number");

        }
    }
}
