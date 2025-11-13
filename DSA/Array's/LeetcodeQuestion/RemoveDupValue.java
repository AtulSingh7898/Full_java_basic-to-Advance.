package LeetcodeQuestion;
import java.util.Arrays;

public class RemoveDupValue {
    public static void main(String args[]){
        int[] nums = {3,2,2,3};
        int val = 3;

        int k = 0;
        for(int i = 0; i<nums.length; i++){
            if(nums[i] != val){
               nums[k] = nums[i];
               k++;
            }
        }
        System.out.println("The nums is "+k);
        System.out.println("The nums of arr is "+Arrays.toString(nums));
    }
    
}
