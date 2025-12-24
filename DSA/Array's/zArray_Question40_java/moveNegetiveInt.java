// Move All Negative Numbers to the Beginning of the Array
//  Input: [1, 1, 3, 2, 7, 5, 11, 6]
//  Output: [1, 7, 5, 1, 3, 2, 11, 6]
//  Explanation: All negative numbers moved to the beginning.

import java.util.Arrays;

public class moveNegetiveInt {
    public static void moveAllNegetiveInteger(int[] nums){
        int i = 0, j = 0, k = 0;
        int n = nums.length;
        while(i < n){
            if(0> nums[i]){
                int temp = nums[k];
                nums[k] = nums[i];
                nums[i] = temp;
                k++;
            }
            i++;
        }
        
    }
    
    public static void main(String[] args){
        int[] nums = {1, -1, -3, 2, -7, -5, 11, 6};
        moveAllNegetiveInteger(nums);
        System.out.println(Arrays.toString(nums));
    }
    
}
