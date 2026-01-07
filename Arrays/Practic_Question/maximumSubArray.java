package Practic_Question;

public class maximumSubArray {
    
    public static void main(String[] args){
        int[] nums  = {12, -29, 24, -10, 20, 30};
        int maxSubArray = 0;
        int maxSum = 0;
        int i = 0;
        int j = nums.length;
        while(i< j){
            maxSubArray = Math.max(nums[i], nums[i]+maxSubArray);
            maxSum = Math.max(maxSum, maxSubArray);
            i++;
        }
        System.out.println(maxSum);

    }
}
