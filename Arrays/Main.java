
import java.util.*;

public class Main{
    public static void main(String args[]){
      Scanner sc = new Scanner(System.in);
      // int marks[] = new int[3];
      int size = sc.nextInt();
      int number[] = new int[size];
      //  marks[0] = 97; //phy 
      //  marks[1] = 96; // cham.
      //  marks[2] = 98; // maths

      //for input
      for(int i = 0; i < size; i++){
         number[i] = sc.nextInt();
      }

      int x = sc.nextInt();
      //  System.out.println(marks[0]);
      //  System.out.println(marks[1]);
      //  System.out.println(marks[2]);

      //for output 
      for(int i = 0; i < number.length; i++){
        if(number[i] == x){
          System.out.println("x is found in index "+i);
        }
      }

    }
}