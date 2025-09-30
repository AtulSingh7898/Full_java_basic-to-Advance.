// import java.util.Scanner;

// public class CountMultiplesOf5 {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int count = 0;

//         System.out.println("Enter numbers (0 to stop):");
//         for (;;) { // Infinite loop until 0 is encountered
//             int num = sc.nextInt();
//             if (num == 0) {
//                 break; // Stop when zero is entered
//             }
//             if (num % 5 == 0) {
//                 count++;
//             }
//         }

//         System.out.println("Count = " + count);
//     }
// }

import java.util.Scanner;

public class CountMultiplesOf5
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		
		int count = 0;
		for(;;){
		    int number = sc.nextInt();
		    if(number == 0){
		        break;
		    }
            if(number%5 == 0){
                count++;
            }
        }
        System.out.println(count);
	}
}
