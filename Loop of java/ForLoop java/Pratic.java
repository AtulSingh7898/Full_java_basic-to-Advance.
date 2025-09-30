import java.util.*;
public class Pratic {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int num = 18;
    int resutl = 0;
    int Digitcount = 0;
    int modulus = 0;
    int temp = num;
    while(temp != 0){
        Digitcount++;
        temp /=10;
    }
    temp = num;
    // while(temp != 0){
    //     int LastDigit = temp%10;
    //     modulus +=(int)Math.pow(LastDigit, Digitcount);

    // }
    modulus +=(int)Math.pow(num, Digitcount);
    int rightPart = num%Digitcount;
    int leftPart  = num/Digitcount;
    int BothPart = rightPart+leftPart;
    if(BothPart == num){
        System.out.println("The number is Kapreker");
    }else{
        System.out.println("Not kapreker: ");
    }

    }
}
