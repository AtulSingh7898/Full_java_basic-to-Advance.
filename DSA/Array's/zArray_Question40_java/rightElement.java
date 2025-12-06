// 23. Replace Each Element with the Greatest Element on its Right
//  Input: [16, 17, 4, 3, 5, 2]
//  Output: [17, 5, 5, 5, 2, 1]
//  Explanation: Replace each element with the greatest element
// on its right.

import java.util.Arrays;

public class rightElement {
    public static void main(String[] atul){
        int[] nums = {16, 17, 4, 3, 5, 2};
        int right = 0;
        int left = nums.length-1;
        int helfright = nums.length/2;

        int i = 0;
        while(i < nums.length){
            if(nums[right] < nums[i]){
                nums[right] = nums[i];
            }
            if(nums[helfright]<nums[left]){
                nums[helfright] = nums[left];
            }
            i++;
            left--;
        }

        System.out.println(Arrays.toString(nums));
        
    }
}
