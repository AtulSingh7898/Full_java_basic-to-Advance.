package zArray_Question20_java;

import java.util.Arrays;

// 10. Merge Two Arrays
//  Input: ([1, 2, 3], [4, 5, 6])
//  Output: [1, 2, 3, 4, 5, 6]
//  Explanation: The merged array is [1, 2, 3, 4, 5, 6].

public class MergArray2 {
    public static void main(String[] args){
        int[] nums = {1, 2, 3};
        int[] nums1 = {4, 5, 6};
        int[] merge = new int[nums.length*2];

        for(int i = 0; i < nums.length; i++){
            merge[i] = nums[i];
        }
        
        for(int i = nums.length, j = 0; i < merge.length;i++,j++){
            merge[i] = nums1[j];
            // j++;
        }

        System.out.println("After Merging arr is "+Arrays.toString(merge));
    }
    
}
