package SubArray;

public class SubArraySum {
    static int MaximumSubArraySum(int[] nums){
        int SubArray =-0;
        int maxSubArray = 0;
        int length = nums.length;
        for(int i = 0; i <length; i++){
            SubArray = Math.max(SubArray+nums[i], nums[i]);
            maxSubArray = Math.max(SubArray, maxSubArray);
        }
        return maxSubArray;
    }
    public static void main(String[] args){
       int nums[] = {12,14,-20,16,-15,20,-30,40};
       int maxSubArray = MaximumSubArraySum(nums);
       System.out.println(maxSubArray);

    }
}
