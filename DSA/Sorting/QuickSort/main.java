package Sorting.QuickSort;

// time complexity:- O(n logn)

import java.util.Arrays;
import java.util.Random;

public class main {
    public static void swap(int nums[], int start, int end){
        int temp = nums[start];
        nums[start] = nums[end];
        nums[end] = temp;
        
    }

    public static int partition(int nums[], int start, int end){
        Random random = new Random();
        int pivoteIndex = random.nextInt(end-start+1);
        swap(nums, pivoteIndex, end); 


        int pivote = nums[end];
        int p = start;
        for(int i = start; i <end; i++){
            if(nums[i] < pivote){
                swap(nums, p,i);
                p++;
            }
        }
        swap(nums, p, end);
        return p;
    }

    public static void quickSort(int nums[], int start, int end){
        if(start<end){
            int pi = partition(nums, start, end);
            quickSort(nums, start, pi-1);
            quickSort(nums, pi+1, end);
        }
    }
    public static void display(int[] nums){
        System.out.println(Arrays.toString(nums));
    }
    public static void main(String[] args) {
        
        int nums[] = {1,2,5,2,6,8,3};
        quickSort(nums, 0, nums.length-1);
        display(nums);
    }
    
}
