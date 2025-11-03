// package ArrayList;

import java.util.Arrays;

public class PassingArrays {
    public static int arrPass(int[] arr, int start, int result){
        if(start > arr.length-1){
            return 1;
        }
        if(arr[start]%2 == 0){
           result = arr[start];
           System.out.println(result);
        //    return arr[start];
        }
        
        return arrPass(arr, start+1, result)*result;
        
    }
    public static int[] createArr(int size){
        int[] arr = new int[size];
        for(int i = 0; i < arr.length; i++){
            arr[i] = (i+1);
        }
        return arr;
    }

    public static void main(String[] args){
        int[] arr = {1,2,3,4};
        
        int number = arrPass(arr,0,1);

        int[] arrStreing = createArr(5);
        for(int num : arrStreing){
            System.out.print(num+" ");
        }
        // System.out.println(Arrays.toString(arrStreing));
        
        // for(int i = 0; i < arr.length; i++){
        //     int n = arrPass(arr,0,1);
        //     System.out.println(n);
        // }
        // System.out.println(Arrays.toString(number));
        // System.out.println(number);
    }
}
