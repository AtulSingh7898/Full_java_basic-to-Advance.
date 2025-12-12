public class SubArraySum {
    static int MaximumSubArray(int[] nums){
       int MaxSub = 0;
       int MaxSum = Integer.MIN_VALUE;
       for(int i = 0; i<nums.length; i++){
         MaxSub = Math.max(MaxSub+nums[i], nums[i]);
         MaxSum = Math.max(MaxSub,MaxSum);
       }
       return MaxSum;
    }
    public static void main(String[] args) {
      int[] nums = {-2,1,-3,4,-1,2,1,-5,4};
      int result = MaximumSubArray(nums);
      System.out.println(result);
    }
    
}
