// package zArray_Question40_java;
import java.util.Arrays;

// 16. Sort an Array Using Bubble Sort
//  Input: [5, 1, 4, 2, 3]
//  Output: [1, 2, 3, 4, 5]
//  Explanation: The array sorted using bubble sort is [1, 2, 3, 4, 5].

public class SortArray {
    public static void main(String[] args){
        int[] num = {5, 3, 4, 2, 1};

        for(int i = 0; i < num.length; i++){
            for(int j = i+1; j< num.length; j++){
                if(num[i] > num[j]){
                    int temp = num[i];
                    num[i] = num[j];
                    num[j] = temp;
                }
            }
        }
        System.out.println(Arrays.toString(num));
    }
}
