package PrefixSum;

import java.util.Arrays;

public class PrefixSum {
    public static void main(String[] args){
        int nums[] = {2, 4, 6, 8, 10};
        //Prefix Sum 
        int n = nums.length; 
        int i = 0;
        int temp = 0;
        // System.out.println(nums.length);

        while(i < n){
            temp+=nums[i];
            nums[i] = temp;
            i++;
            // j++;
        }
        System.out.println(Arrays.toString(nums));
    }
    
}
