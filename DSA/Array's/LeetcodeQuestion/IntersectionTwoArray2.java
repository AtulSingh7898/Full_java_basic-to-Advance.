// package LeetcodeQuestion;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
public class IntersectionTwoArray2 {
    public static void main(String[] args){
        int[] nums = {1,2,3};
        int[] nums2 = {2,4};

        Set<Integer> set = new HashSet<>();
        int i = 0, j = 0;
        while(i <nums.length && j < nums.length){
            if(nums[i] == nums2[j]){
                set.add(nums[i]);
                i++;
                j++;
            }else if(nums[i] < nums2[j]){
                i++;
            }else{
                j++;
            }
        }
        // System.out.println(set);

        int []arr = new int[set.size()];
        int k = 0;
        for(int num : set){
            arr[k++] = num;
        }
        
        System.out.println(Arrays.toString(arr));
    }
    
}
