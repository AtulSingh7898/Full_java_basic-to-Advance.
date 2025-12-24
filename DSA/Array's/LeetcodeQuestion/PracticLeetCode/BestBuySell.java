package PracticLeetCode;
// 121. Best Time to Buy and Sell Stock
// You are given an array prices where prices[i] is the price of a given stock on the ith day.
// You want to maximize your profit by choosing a single day to buy one stock and choosing
//  a different day in the future to sell that stock.
// Return the maximum profit you can achieve from this transaction. If you cannot achieve any profit, return 0.

public class BestBuySell {
    static int sellStock(int[] nums){
        int i = 0;
        int buyDay = 0;
        while(i < nums.length){
            if(buyDay < nums[i]){
                buyDay = nums[i];
            }
            i++;
        }
        i = 0;
        int sell = nums[0];
        while(i < nums.length){
            if(sell<nums[i]){
                sell = nums[i];
            }
            i++;
        }
        int benefits = sell-buyDay;
        return benefits;
    }

    public static void main(String[] args){
        int nums[] = {2,4,1};
        int result = sellStock(nums);
        System.out.println(result);

        
    }
    
}
