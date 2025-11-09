// package TwoPointer;
import java.util.Arrays;

public class reverseArray {
    public static void main(String[] args){
        int arr[] = {12,34,54,5,46,65,42};
        for(int i = arr.length-1; i >= 0; i--){
            System.out.print(arr[i]+" ");
        }
        // int first = 0;
        // int last = arr.length;
        System.out.println();
        int i = 0, j = arr.length-1;
        while(i < j){
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }
        System.out.println("the reverse arr is "+Arrays.toString(arr));
    }
    
}
