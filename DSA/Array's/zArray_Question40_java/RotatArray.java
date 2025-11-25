// package zArray_Question40_java;

import java.util.Arrays;

// . Rotate an Array by k Positions
//  Input: ([1, 2, 3, 4, 5], 2)
//  Output: [4, 5, 1, 2, 3]
//  Explanation: The array rotated by 2 positions is [4, 5, 1, 2, 3].

public class RotatArray {

    public static void rotatArray(int[] nums, int i, int j){
        while(i < j){
            int temp = nums[i];
            nums[i] = nums[j];
            nums[j] = temp;
            i++;
            j--;
        }
    }
    public static void main(String[] args) {
        int[] nums = {1,2,3,4,5};
        int k = 2;
        k = k%nums.length;
        rotatArray(nums, 0, nums.length-1);
        rotatArray(nums, 0, k-1);
        rotatArray(nums, k, nums.length-1);

        System.out.println(Arrays.toString(nums));
    }
    
}
