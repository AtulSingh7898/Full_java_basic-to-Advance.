package Sorting.Leetcode;

import java.util.Arrays;

public class squareSortedArrays {
    public static int[] sqSortArr(int[] nums){
        int left = 0;
        int right = nums.length-1;
        for(int i = nums.length-1; i>= 0; i--){
            int leftSquare = nums[left]*nums[left];
            int rightSquare = nums[right]*nums[right];

            if(leftSquare>rightSquare){
                nums[i] = leftSquare;
                left++;
            }else{
                nums[i] = rightSquare;
                right--;
            }

        }
        return nums;
    }
    public static void main(String[] args) {
        int nums[] = {-4,-1,0,3,10};
        int result[] = sqSortArr(nums);
        System.out.println(Arrays.toString(result));

    }
    
}
