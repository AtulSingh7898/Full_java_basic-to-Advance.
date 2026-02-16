package Kadanes_Algo;

public class maxProfit{
    public static int maxProfite(int[] nums){
        int minPrice = nums[0];
        int maxProfit = 0;
        for(int i = 1; i < nums.length; i++){
            minPrice = Math.min(nums[i], minPrice);
            int profit = nums[i]-minPrice;
            maxProfit = Math.max(maxProfit, profit);
        }
        return maxProfit;
    }
    public static void main(String[] args) {
        int nums[] = {7,1,5,3,6,4};
        int result = maxProfite(nums);
        System.out.println(result);
        
    }
    
}
