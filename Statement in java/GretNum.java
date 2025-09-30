import java.util.*;

public class GretNum {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the first Number ");
        int x = sc.nextInt();
        System.out.print("Enter the Second Number ");
        int y = sc.nextInt();
         
        if(x > y){
            System.out.println(x+" is Greater");
        }else{
            System.out.println(y+" is Greater");
        }
       
    }
}
