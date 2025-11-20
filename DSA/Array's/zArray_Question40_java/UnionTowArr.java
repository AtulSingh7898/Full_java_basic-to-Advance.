package zArray_Question40_java;
// Find the Union of Two Arrays
//  Input: ([1, 2, 3], [2, 3, 4])
//  Output: [1, 2, 3, 4]
//  Explanation: The union of the arrays is [1, 2, 3, 4].

import java.util.ArrayList;
import java.util.Arrays;

public class UnionTowArr {
    public static void main(String[] args){
        int[] nums = {1, 2, 3};
        int[] nums1 = {2, 3, 4};
        int sum = 0;
    
        ArrayList<Integer> list = new ArrayList<>();
        int[] result = new int[nums.length*2];
        for(int i = 0; i < nums.length; i++){
            for(int j = i+1; j<nums1.length; j++){
                if(nums[i] != nums1[j]){
                    result[sum] = nums1[j];
                    
                    sum++;
                }
            }
        }
        System.out.println("The result of arr is "+Arrays.toString(result));
    }
    
}
