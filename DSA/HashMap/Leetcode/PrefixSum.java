package Leetcode;

import java.util.Arrays;

public class PrefixSum {
    public static void prefixSum(int[] nums){
        int sum = 0;
        System.out.println(Arrays.toString(nums));
        int arr[] = new int[nums.length];
        for(int i = 0; i < nums.length;i++){
            sum += nums[i];
            arr[i] = sum;
        }
        
        System.out.println(Arrays.toString(arr));
        int minus[] = new int[nums.length];
        for(int i = nums.length-1; i >= 0; i--){
            if(i == 0) {minus[i] = arr[i]; break;}
            minus[i] = arr[i]-arr[i-1];
            
        }
        System.out.println(Arrays.toString(minus));
    }
    public static void main(String[] arsg){
        int nums[] = {5,2,3,5,7,3,2};
        prefixSum(nums);

    }
    
}
