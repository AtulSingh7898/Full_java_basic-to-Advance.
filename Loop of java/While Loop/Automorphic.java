import java.util.Scanner;

public class Automorphic {


    static int countDigit(int num){
        if(num == 0) return 0;
        return countDigit(num/10)+1;
    }
    static int power(int num, int exp){
        if(exp == 0) return 1;
        return num*power(num, exp-1);
    }

    static int isAutomorphic(int num, int count, int Square){
        int right = 0;
        if(num == 0) return 0;
        if(Square%num == 0) {
            int modul = power(10, count);
            right = Square%modul;
        }
        
        
        return isAutomorphic(num/10, count, Square)+right;
    }
    public static void main(String[] args) {
        
        int num = 625;
        int Square = num*num;
        int countN = countDigit(num);
        int right = isAutomorphic(num, countN, Square);
        System.out.println(right);
    }
}
