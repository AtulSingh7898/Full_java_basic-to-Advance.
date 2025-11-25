// package zArray_Question40_java;

// 7. Find the Maximum Product of Two Integers in an Array
//  Input: [1, 2, 3, 4, 5]
//  Output: 20
//  Explanation: The maximum product is 4 * 5 = 20.

public class MaxProduct {

    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        int productMax = 1;

        for(int i = 0; i<arr.length; i++){
            for(int j = i+1; j < arr.length; j++){
                if(productMax < arr[i]*arr[j]){
                    productMax = arr[i]*arr[j];
                }
            }
        }
        System.out.println(productMax);
    }
    
}
