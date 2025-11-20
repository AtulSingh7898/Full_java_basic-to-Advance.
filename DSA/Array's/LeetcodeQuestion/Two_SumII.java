// package LeetcodeQuestion;

import java.util.Arrays;

public class Two_SumII {
    static int[] twoSum(int[] nums, int target){
        int i = 0;
        int j = nums.length-1;
        while(i < j){
            int sum = nums[i]+nums[j];
            if(sum == target){
                return new int[]{i+1,j+1};
            }else if(sum < target){
                i++;
            }else{
                j--;
            }
        }
        return new int[]{};
    }
    public static void main(String args[]){
        int num[] = {2,4,7,11,12};
        int target = 9;
        int result[] = twoSum(num, target);
        System.out.println(result);
        System.out.println(Arrays.toString(result));
    }
}
