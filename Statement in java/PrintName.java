import java.util.*;


public class PrintName {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int calculater = sc.nextInt();
        int a = sc.nextInt();
        int b = sc.nextInt();

        int sum = a + b;
        int diff = a - b;
        int mult = a * b;
        int divid = a/b;

        switch(calculater){
            case 1: System.out.println(sum);
            break;
            case 2: System.out.print(diff);
            break;
            case 3: System.out.print(mult);
            break;
            case 4: System.out.print(divid);
            break;

        }
        // if(a+b){
        //     System.out.println(sum);
        // }else{
        //     if(calculater){
        //         System.out.println("The a is greater");
        //     }else{
        //         System.out.println("the a is lesser");
        //     }
        // }
        

    }
    
}
