import java.util.Scanner;

public class Diserium{

    public static int isDiserium(int number){
        int PowerDigit = 0;
        int result = 0;
        int temp = number;
        while (temp != 0){
            temp /= 10;
            PowerDigit++;
        }   
        temp = number;
        while(temp != 0){
            int digit = temp%10;
            result += (int)Math.pow(digit, PowerDigit);
            temp /= 10;
            PowerDigit--;
        }
        return  result;

    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        for(int i = 1; i<=1000; i++){
            int number = i;
        int result = isDiserium(number);
            if(number == result){

            System.out.println(result);
        }
        // else{
        //     System.out.println("The number is Not diserium ");
        // }
        }
        
        

    }
    
}
