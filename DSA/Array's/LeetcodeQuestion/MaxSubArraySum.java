public class MaxSubArraySum {
    static int maxSubArrays(int[] nums){
        int maxSum = Integer.MIN_VALUE;
        int subSum = 0;

        for(int i = 0; i < nums.length; i++){
            subSum = Math.max(nums[i], subSum+nums[i]);
            maxSum = Math.max(maxSum, subSum);
        }
        return maxSum;
    }
    public static void main(String[] args){
        int[] nums = {1,-2,3,-4,5,6,4,-1};
        int result = maxSubArrays(nums);
        System.out.println(result);
    }
}
