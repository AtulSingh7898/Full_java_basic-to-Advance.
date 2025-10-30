package Basic_Question;
public class MaxSubarraySum {
    public static void main(String[] args) {
        int[] nums = {-2, 1, -3, 4, -1, 2, 1, -5, 4};

        int maxSum = kadane(nums);
        System.out.println("Maximum Subarray Sum: " + maxSum);
    }

    static int kadane(int[] arr) {
        int maxSoFar = Integer.MIN_VALUE;
        int currentSum = 0;

        for (int num : arr) {
            currentSum += num;
            if (currentSum > maxSoFar) {
                maxSoFar = currentSum;
            }
            if (currentSum < 0) {
                currentSum = 0;
            }
        }
        return maxSoFar;
    }
}
