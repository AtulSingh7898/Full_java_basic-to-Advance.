import java.util.Scanner;

public class VoterE {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the age and Nationality: ");
        int num = sc.nextInt();
        sc.nextLine();
        // System.out.print("Enter the age and Nationality: ");
        String Nationality = sc.nextLine();
        if(num>=18 && Nationality.equalsIgnoreCase("Indian")){
            System.out.println("Eligible for Vote: ");
        }else{
            System.out.println("Not Eligible for Vote: ");
        }
    }
}
