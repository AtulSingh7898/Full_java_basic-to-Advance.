// package LeetcodeQuestion;

import java.util.Arrays;

public class sortColors{
    public static void sortestColor(int[] nums){
        int first = 0;
        int second = 0;
        int last = nums.length-1;

        while(second<last){
            if(nums[second] == 0){
                int temp = nums[first];
                nums[first] = nums[second];
                nums[second] = temp;
                first++;
                second++;
            }if(nums[second] == 1){
                second++;
            }else{
                int temp = nums[second];
                nums[second] = nums[last];
                nums[last] = temp;
                last--;
            }
        }
    }
    public static void main(String[] args){
        // Dutch Nation algorithm
        int nums[] = {0,2,1,0,2,1,2};
        sortestColor(nums);
        System.out.println(Arrays.toString(nums));
    }
}