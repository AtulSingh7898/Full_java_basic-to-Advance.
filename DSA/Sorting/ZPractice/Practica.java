// package Sorting.ZPractice;

import java.util.Arrays;

public class Practica{
    public static void quickSort(int[] nums, int low, int high){
        if(low<high){
            int pi = partition(nums, low, high);
            quickSort(nums, low, pi-1);
            quickSort(nums, pi+1, high);
        }
    }

    public static int partition(int nums[], int low, int high){
        int pivot = nums[high];
        int p = low-1;

        for(int i = low; i < high; i++){
            if(nums[i] < pivot){
                p++;
                int temp = nums[i];
                nums[i] = nums[p];
                nums[p] = temp;
            }
        }
        
        int temp = nums[p+1];
        nums[p+1] = nums[high];
        nums[high] = temp;
        return p + 1;
    }
    public static void main(String[] args) {
        int nums[] = {2,4,8,4,1,3};
        quickSort(nums, 0, nums.length-1);
        System.out.println(Arrays.toString(nums));
    }
}