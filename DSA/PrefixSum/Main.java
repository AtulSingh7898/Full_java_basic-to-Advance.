package PrefixSum;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] arr={2,4,5,7,8,10};
        int sum = 0;
        int temp = 0;
        for(int i = 0; i < arr.length; i++){
            
            temp += arr[i];
            arr[i] = temp;
        }
        System.out.println(Arrays.toString(arr));
    }
}
