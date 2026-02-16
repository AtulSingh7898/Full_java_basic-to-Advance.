package Kadanes_Algo;

public class maxSubSum {
    public static int maxSubArraySum(int[] nums){
        int currentSum = 0;
        int maximumSum = Integer.MIN_VALUE;
        int i = 0;
        while(i< nums.length){
            currentSum  = Math.max(nums[i], nums[i]+currentSum);
            maximumSum = Math.max(currentSum, maximumSum);
            i++;
        }
        return maximumSum;
    }
    public static void main(String[] args) {
        int nums[] = {1,-3,5,-4,-1,6,-2,4};
        int result = maxSubArraySum(nums);
        System.out.println("The Maximum SubArray Sum Is: "+ result);
        
    }
    
}
