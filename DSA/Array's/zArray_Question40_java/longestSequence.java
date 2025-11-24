package zArray_Question40_java;

import java.util.Arrays;

// 19. Find the Length of the Longest Consecutive Sequence in an
// Array
//  Input: [100, 4, 200, 1, 3, 2]
//  Output: 4
//  Explanation: The longest consecutive sequence is [1, 2, 3, 4]
// with length 4.


public class longestSequence {
    public static void main(String[] args) {
        int[] nums = {100, 4, 200, 1, 3, 2};
        Arrays.sort(nums);

        int i = 0, j = 0;
        int count = 0;
        int k = nums.length-1;
        while (i < k && j < k) {
            if (nums[i]+1 == nums[j+1]) {
                count = nums[j+1];
                
            }
            i++;
            j++;
        }
        System.out.println(count);
        System.out.println(Arrays.toString(nums));

        
    }
}
