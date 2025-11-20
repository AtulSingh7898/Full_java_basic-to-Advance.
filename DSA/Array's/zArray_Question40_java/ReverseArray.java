package zArray_Question40_java;

import java.util.Arrays;

//  Reverse an Array
//  Input: [1, 2, 3, 4, 5]
//  Output: [5, 4, 3, 2, 1]
//  Explanation: The array reversed is [5, 4, 3, 2, 1].

public class ReverseArray {
    static int[] recursiveReverseArray(int[] arr, int ft, int Lt){
        if(ft >= Lt) return arr;
        int temp = arr[ft];
        arr[ft] = arr[Lt];
        arr[Lt] = temp;
        return recursiveReverseArray(arr,ft+1,Lt-1);

    } 
    static int[] reverseArray(int []arr){
        int i = 0;
        int j = arr.length-1;
        // while(i < j){
        //     int temp = arr[i];
        //     arr[i] = arr[j];
        //     arr[j] = temp;
        //     i++;
        //     j--;
        // }
        arr = recursiveReverseArray(arr,i,j);
        return arr;

    }

    public static void main(String[] args){
        int[] arr = {1, 2, 3, 4, 5};
        int n = arr.length-1;
        int[] result = reverseArray(arr);
        System.out.println("The Reverse Array is "+Arrays.toString(result));
    }
    
}
