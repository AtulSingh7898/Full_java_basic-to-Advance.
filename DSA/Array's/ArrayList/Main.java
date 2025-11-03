package ArrayList;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        int [] arr = {10, 20, 30, 40, 50};
        int insertIndex = 2;
        int insertValue = 100;
        

        for(int i = insertIndex; i > insertValue; i--) {
            arr[i] = arr[i-1];
        }
        arr[insertIndex] = insertValue;

        System.out.println("array after deletion is: "); 
        for(int i=0; i<arr.length-1; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println("");
        for (int num : arr) {
            System.out.print(num + " ");
        }

    // ArrayList<int> list = new ArrayList<>();
    
    }
    
}
