// package LeetcodeQuestion;

import java.util.Arrays;

public class RemoveDuplicate2{
    // static int 
    public static void main(String[] args) {
        int[] nums = {0,0,0,1,1,1,1,2,2,2,3}; 
        int k = 0;
        System.out.println(nums.length);
        // int result = removeDuplicte2(nums);
        for(int i = 0; i < nums.length; i++){
            if(k < 2 && nums[i] != nums[k-2]){
                nums[k] = nums[i];
            }
        }
        System.out.println(k);
        System.out.println(Arrays.toString(nums));

    }
}