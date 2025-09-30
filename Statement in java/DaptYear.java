import java.util.*;

public class DaptYear {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the department: ");
        int department = sc.nextInt();
        System.out.print("Enter the year : ");
        int year = sc.nextInt();
        

        switch(department){
            case 1:
            switch(year){
                case 1: System.out.println("Cse First Year");
                break;
                case 2: System.out.println("Cse Second Year");
                break;
                case 3: System.out.println("Cse Third Year");
                break;
                case 4: System.out.println("Cse Fouth Year");
                break;
                default: System.out.println("Ony have four year Course: ");
            }
            break;
            case 2:
            switch(year){
                case 1: System.out.println("Mech First Year");
                break;
                case 2: System.out.println("Mech Second Year");
                break;
                case 3: System.out.println("Mech third Year");
                break;
                case 4: System.out.println("Mech Fouth Year");
                break;
                default: System.out.println("Ony have four year Course: ");
            }
            break;
            case 3:
            switch(year){
                case 1: System.out.println("IT First Year");
                break;
                case 2: System.out.println("IT Second Year");
                break;
                case 3: System.out.println("IT third Year");
                break;
                case 4: System.out.println("IT Fourth Year");
                break;
                default: System.out.println("Ony have four year Course: ");
            }
            break;
            case 4:
            switch(year){
                case 1: System.out.println("AI First Year");
                break;
                case 2: System.out.println("AI Second Year");
                break;
                case 3: System.out.println("AI third Year");
                break;
                case 4: System.out.println("AI Fourth Year");
                break;
                default: System.out.println("Ony have four year Course: ");
            }
            break;
            default: System.out.println("We have only Four Department: ");
        }
    }
}
