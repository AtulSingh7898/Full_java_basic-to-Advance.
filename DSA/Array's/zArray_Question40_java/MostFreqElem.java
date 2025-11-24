package zArray_Question40_java;
// 20. Find the Most Frequent Element in an Array
//  Input: [1, 3, 2, 3, 4, 3, 5]
//  Output: 3
//  Explanation: The most frequent element is 3.

public class MostFreqElem {
    public static void main(String[] args){
        int[] arr = {1, 3, 2, 3, 4, 3, 5};

        int i = 0;
        int j = arr.length-1;
        int frequent = 0;
        while(i < j){
            if(arr[i] == arr[j]){
                frequent = arr[i];
            }
            i++;
            j--;
        }
        System.out.println(frequent);
    }
    
}
