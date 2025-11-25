// package zArray_Question40_java;

import java.util.ArrayList;
import java.util.Arrays;

// 11. Find the Intersection of Two Arrays
//  Input: ([1, 2, 3], [2, 3, 4])
//  Output: [2, 3]
//  Explanation: The common elements are 2 and 3.

public class InteresectionArray {

    // using recursion 
    
    public static void main(String args[]){
        int[] num = {1,2,3};
        int[] num1 = {2,3};

        // findArrayNum(num,num1,0);
        ArrayList<Integer> list = new ArrayList<>();

        int i = 0, j = 0;
        while(i < num.length && j < num1.length){
            if(num[i] == num1[j]){
                list.add(num[i]);
                i++;
                j++;
            }else if(num[i] < num1[j]){
                i++;
            }else{
                j++;
            }
        }
        int[] arr = new int[list.size()];
        int k = 0;
        for(int n: list){
            arr[k++] = n;
        }
        System.out.println(Arrays.toString(arr));
    }
}
