package Kadanes_Algo;

// Best Time to Buy and Sell Stock II

public class MaxProfiteII {
    public static int maxProfitII(int[] nums) {
        int profit = 0;
        for(int i = 1; i < nums.length; i++){
            if(nums[i]>nums[i-1]){
                profit += nums[i] - nums[i-1];
            }
        }
        return profit;
    }
    public static void main(String[] args){
        int nums[] = {7,1,5,3,6,4};
        int result = maxProfitII(nums);
        System.out.println(result);


    }
    
//     Input: prices = [7,1,5,3,6,4]
//     Output: 7
}
