import java.util.Scanner;

public class even {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Number: ");
        int s = sc.nextInt();
        System.out.print("Enter the Number: ");
        int p = sc.nextInt();
        int Even_sum = 0;
        int odd_sum = 0;
        for(int i = s; i <= p; i++){
            
            if(i%5 == 0){
                odd_sum += i;
            }else if(i%3 == 0){
                Even_sum += i;
            }
        }

        int diff = Even_sum-odd_sum;
        System.out.println(odd_sum);
        System.out.println(Even_sum);
        if(diff%5 == 0){
            System.out.println("You Total diff number is:divisible by 5 ");
        }else{
            System.out.println("You Total not diff number is: "+diff);
        }
        // System.out.println("You Total number is: " +odd_sum);
        // System.out.println("You Total number is: " +Even_sum);


        
    }
}
