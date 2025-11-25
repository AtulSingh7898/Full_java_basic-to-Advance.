// package zArray_Question40_java;
// Find the Second Largest Element in an Array
//  Input: [1, 2, 3, 4, 5]
//  Output: 4
//  Explanation: The second largest element is 4.

public class SecondLargest {

    static int secondLastElement(int[] arr){
        int firstMax = 0;
        int secondMax = 0;
        for(int i = 0; i < arr.length; i++){
            if(firstMax<arr[i]){
                int temp = firstMax;
                firstMax = arr[i];
                secondMax = temp;
            }else if(arr[i]> secondMax && firstMax != arr[i]){
                secondMax = arr[i];
            }
        }
        return secondMax;

    }

    public static void main(String[] args){
        int[] arr = {6,1, 2, 3, 4, 5};
        int result = secondLastElement(arr);
        System.out.println("The second largest number is "+result);
    }
    
}
