package zArray_Question20_java;
// 1. Find the Maximum Element in an Array
//  Input: [1, 2, 3, 4, 5]
//  Output: 5
//  Explanation: The maximum element in the array is 5.

public class FindMax {

    static int findMAxNUmber(int[] arr,int st, int max){
        // int max = arr[0];
        if(st > arr.length-1) return max;
        if(max<arr[st]){
            max = arr[st];
        }

        return findMAxNUmber(arr, st+1,max);
    }
    public static void main(String[] args){
        int arr[] = {1, 2, 3, 4, 5};
        int max = arr[0];
        int maxe = findMAxNUmber(arr,0,0);
        System.out.println("The mex element is "+maxe);
        
        for(int i = 0; i< arr.length; i++){
            if(arr[i]>max){
                max = arr[i];
            }
        }
        System.out.println("The max number is: "+max);
    }
}
