// package LeetcodeQuestion;

import java.util.Arrays;

public class RotetArray {
    public static int[] rotate(int[] nums, int k) {
        int i = 0; 
        int j = nums.length-1;
        k = k%nums.length;
        while(i < j){
            int temp = nums[i];
            nums[i] = nums[j];
            nums[j] = temp;
            i++;
            j--;
        }
        
        // if(nums.length < j){
        //     k = nums.length-1;
        // }
        i = 0;
        j = k-1;
        while(i < j){
            int temp = nums[i];
            nums[i] = nums[j];
            nums[j] = temp;
            i++;
            j--;
        }
        i = k;
        j = nums.length-1;
        
        while(i < j){
            int temp = nums[i];
            nums[i] = nums[j];
            nums[j] = temp;
            i++;
            j--;
        }
        //123
        //321
        //312
        return nums;
    }

    public static void main(String[] args){
        int nums[] = {1,2,3};
        // Output: [5,6,7,1,2,3,4]

        
        int result[] = rotate(nums, 7);
        System.out.println(Arrays.toString(result));

    }
    
}
