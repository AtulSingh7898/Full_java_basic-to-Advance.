// 38. Find the Median of Two Sorted Arrays
//  Input: ([1, 3], [2])
//  Output: 2.0
//  Explanation: The median of the combined sorted array [1, 2, 3]
// is 2.

import java.util.Arrays;

public class MidienNumber {
    public static void main(String[] args){
        int[] nums = {1,3};
        int k = nums[2];
        // int i = 0;
        int j = nums.length-1;
        int sout = 0;
        int inservalue = 2;
        int cout = 1;
        for(int i = nums.length-1; i> inservalue; i--){
            nums[i] = nums[i-1];
        }
        
        nums[1] = inservalue;
        System.out.print(Arrays.toString(nums));
    }
}
