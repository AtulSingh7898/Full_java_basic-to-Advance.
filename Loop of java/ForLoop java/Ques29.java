import java.util.Scanner;

public class Ques29 {

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("List Of Numbers ");
              

        for(int i = 1; i <= 4; i++){
            int n = sc.nextInt();  

            if(n%11 == 0){
                System.out.println("Stoped at 11");
                break;
            }
            // if(n%11 == 0 && n/11 == 1){
            //     System.out.print("Stopped at "+n);
            //     break;
            // }else{
            //     System.out.println("Not Stopped At 11 ");
            //     break;
            // }
            
         }


    }
    
}
