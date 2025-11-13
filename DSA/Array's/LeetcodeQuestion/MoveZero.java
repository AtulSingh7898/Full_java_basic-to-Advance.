package LeetcodeQuestion;

import java.util.Arrays;

public class MoveZero {
    public static void main(String args[]){
        int[] arr = {0,1,3,0,12,32,0};
        
        int lastZero = 0;
            for(int i = 0; i< arr.length; i++){
            if(arr[i] != 0){
                int temp = arr[i];
                arr[i] = arr[lastZero];
                arr[lastZero] = temp;
                lastZero++;
            }
        }
        System.out.println(Arrays.toString(arr));
    }
    
}
