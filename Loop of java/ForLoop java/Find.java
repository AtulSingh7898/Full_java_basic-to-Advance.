import java.util.Scanner;
public class Find {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // int number = 153;
        // int OriginalNumber = number;
        // int NumberOfDigit = 0;
        // int result = 0;
        // int temp = number;
        int count = 0;

        for(int i = 1; i <= 1000; i++){

        int number = i;
        int OriginalNumber = number;
        int NumberOfDigit = 0;
        int result = 0;
        int temp = number;
        
        while(temp != 0){
            temp = temp/10;
            NumberOfDigit++;
        }

        temp = number;
        while(temp != 0){
          int digit = temp%10;
          result +=(int)Math.pow(digit, NumberOfDigit);
          temp = temp/ 10;
          
        }
         if(OriginalNumber == result){
        //     System.out.println(result);
        System.out.println(result);
        count++;
        
        }

        
        // System.out.println(count);
        //else{
        //     System.out.println("Not ArmStrong Number: ");
        // }
        
      }
      System.out.println(count);
        
    }
}
