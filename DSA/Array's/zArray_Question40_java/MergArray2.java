package zArray_Question40_java;

import java.util.Arrays;

// 10. Merge Two Arrays
//  Input: ([1, 2, 3], [4, 5, 6])
//  Output: [1, 2, 3, 4, 5, 6]
//  Explanation: The merged array is [1, 2, 3, 4, 5, 6].

public class MergArray2 {
    static int[] mergeArray(int[] arr, int[] arr1, int[] merge,int st){
        if(st>merge.length-1) return merge;
        if(st < arr.length){
            merge[st] = arr[st];
        }else{
            merge[st] = arr1[st-arr.length];
        }
        return mergeArray(arr, arr1, merge, st+1);
    }

    static int[] mergeBothArray(int[] arr, int[] arr1){
        int[] merge = new int[arr.length*2];
        int[] result = mergeArray(arr, arr1, merge,0);
        arr = result;
        return arr;
    }

    public static void main(String[] args){
        int[] nums = {1, 2, 3};
        int[] nums1 = {4, 5, 6};
        int[] merge = new int[nums.length*2];
        int[] result = mergeBothArray(nums, nums1);
        System.out.println("recursion "+Arrays.toString(result));
        System.out.println(nums.length==nums1.length);
        // System.out.println(Arrays.equals(null, null));

        // for(int i = 0; i < nums.length; i++){
        //     merge[i] = nums[i];
        // }
        // for(int i = nums.length, j = 0; i < merge.length;i++,j++){
        //     merge[i] = nums1[j];
        //     // j++;
        // }

        for(int i = 0; i < merge.length;i++){
            if(i < nums.length) merge[i] = nums[i];
            else merge[i] = nums1[i-nums.length];
            // j++;
        }
        System.out.print("After Merging arr is "+Arrays.toString(merge));

        nums = merge;
        System.out.println();
        for(int num : nums){
            System.out.print(num+" ");
        }
    }
    
}
