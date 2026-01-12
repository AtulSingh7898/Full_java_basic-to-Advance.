
import java.util.Arrays;

public class justUnderstand {
    public static void main(String[] args) {
        int[] arr1 =  {1,2,3};
        int[] arr2 =  {1,2,3};
        int[] arr3 = new int[]{1,2,3};
        int a = 10;
        int b = 10;
        System.out.println("a and b is "+(a == b)); // this is only for primitive datatype valid
        System.out.println("arr1 and arr2 with double equals "+(arr1 == arr2));
        System.out.println("arr1 and arr3 with double equals "+(arr1 == arr3));
        System.out.println("arr2 and arr3 with double equals "+(arr2 == arr3));

        System.out.println();
        // the number is using equals
        System.out.println("arr1 and arr2 with equals "+Arrays.equals(arr2,arr1));
        System.out.println("arr1 and arr3 with equals "+Arrays.equals(arr1,arr3));
        System.out.println("arr2 and arr3 with equals "+Arrays.equals(arr2,arr3));

        System.out.println();
        // also for string 
        String s1 = "Atul";
        String s2 = "Atul";
        String s3 = new String("Atul");



        System.out.println("s1 and s2 with double equals "+(s1 == s2));
        System.out.println("s1 and s3 with double equals "+(s1 == s3));
        System.out.println("s2 and s3 with double equals "+(s2 == s3));
        System.out.println();

        // double equals 
        System.out.println("s1 and s2 with equals "+(s1.equals(s2)));
        System.out.println("s1 and s3 with equals "+(s1.equals(s3)));
        System.out.println("s2 and s3 with equals "+(s2.equals(s3)));



    }
}
