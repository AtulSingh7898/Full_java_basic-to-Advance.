package SubArray;

public class KthSubArraySum {
    public static int SubArraySumEqualsToK(int[] nums, int k){
        int count = 0;
        for(int i = 0; i < nums.length; i++){
            int sum = 0;
            for(int j = 0; j <= i; j++){
                sum += nums[j];
                if(sum == k){
                    count += 1;
                }
            }
        }
        return count;
    }
    public static void main(String[] args) {
        int[] nums = {1,1,1};
        int k = 2;
        System.out.println(SubArraySumEqualsToK(nums, k));
    }
}
