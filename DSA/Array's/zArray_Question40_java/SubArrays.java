public class SubArrays {
    
// 25. Findthe Maximum Sum Subarray Using Kadane's Algorithm
//  Input: [2, 3, 4, 1, 2, 1, 5, 3]
//  Output: 7
//  Explanation: The maximum sum subarray is [4, 1, 2, 1, 5] with
// sum 7.
    static int MaxSubArray(int[] nums, int result, int maxeEnd, int st){
        if(st > nums.length-1){
            return result;
        }
        maxeEnd = Math.max(maxeEnd+nums[st], nums[st]);
        result = Math.max(maxeEnd, result);
        return MaxSubArray(nums, result, maxeEnd, st+1);
    }
    public static void main(String[] atul){
        int[] nums = {2, 3, 4, 1, 2, 1, 5, 3};

        int result = 0;
        int maxEnd = 0;
        int res = MaxSubArray(nums,result,maxEnd,1);
        System.out.println(res);

        for(int i = 1; i < nums.length; i++){
            maxEnd = Math.max(maxEnd+nums[i], nums[i]);
            result = Math.max(maxEnd, result);
        }
        System.out.println(result);
    }
    
}
