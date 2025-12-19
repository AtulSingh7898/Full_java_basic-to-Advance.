//35. Rotate an Array to the Right by K Steps
//  Input: ([1, 2, 3, 4, 5], 3)
//  Output: [3, 4, 5, 1, 2]
//  Explanation: The array rotated to the right by 3 steps is [3, 4, 5,
// 1, 2]
import java.util.Arrays;
public class RotateArray {
    static void rotateArrays(int i, int j, int[] nums){
        
        while(i <= j){
            int temp = nums[i];
            nums[i] = nums[j];
            nums[j] = temp;
            i++;
            j--;
        }

    }
    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4, 5};
        int k = 3;

        rotateArrays(0,nums.length-1, nums);
        rotateArrays(0,k-1, nums);
        rotateArrays(k,nums.length-1, nums);
        System.out.println(Arrays.toString(nums));
    }
    
}
