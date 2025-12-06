import java.util.Arrays;

public class practicEverythings{
    public static void main(String args[]){
        // to start
        // initional Arrays 
        // unsorted array 
        // int[] nums = {11,12,3,14,4,2,1};
        // sorted Array 
        // for(int i = 0; i < nums.length; i++){
        //     for(int j = i+1; j < nums.length; j++){
        //         if(nums[i] > nums[j]){
        //             int temp = nums[j];
        //             nums[j] = nums[i];
        //             nums[i] = temp;
        //         }
        //     }
        // }

        // int[] nums = {11,12,3,14,4,2,1};
        // int insetIndex = 4;
        // int insetValue = 15;
        // for(int i = nums.length-1; i > insetIndex;  i--){
        //     nums[i] = nums[i-1];
        // }
        // nums[insetIndex] = insetValue;
        // for(int num : nums){
        //     System.out.print(num+" ");
        // }

        // int num[] = {1,2,3,2,4,5,2};
        // int deletIndex = 3;
        // for(int i = deletIndex; i < num.length-1; i++){
        //     num[i] = num[i+1];
        // }
        // num[num.length-1] = 0;
        // for(int i : num){
        //     System.out.print(i+" ");
        // }

        // Object[] nums = new Object[6];
        // // int[] nums = new int[6];
        // for(int i = 0; i < nums.length; i++){
        //     System.out.print(nums[i]+" ");
        // }
        // for data type 
        // nums[0] = 10;
        // nums[1] = 10;
        // nums[2] = 10;
        // nums[3] = 10;
        // nums[4] = 10;
        // nums[5] = 10;
        // System.out.println();
        // for object 
        // nums[0] = true;
        // nums[1] = "Atul";
        // nums[2] = 'a';
        // nums[3] = 10.0;
        // nums[4] = 50.2f;
        // nums[5] = 10;
        // for(int i = 0; i < nums.length; i++){
        //     System.out.print(nums[i]+" ");
        // }

        // Copy Array
        // int num[] = {1,2,3,4,5};
        // int[] arr = new int[7];

        // for(int i = 0; i < num.length; i++){
        //     arr[i] = num[i];
        // }
        // arr[5] = 6;
        // arr[6] = 7;
        // for(int i : arr){
        //     System.out.print(i+" ");
        // }

        // int[] nums = {10,20,30,40,50};
        // int[] nums2 = Arrays.copyOf(nums, nums.length);
        // System.out.println("the arr is "+Arrays.toString(nums));
        // System.out.println("the Copy arr is "+Arrays.toString(nums2));

        // exception handling 
        // int arr[] = {1,2,3};
        // try{
        //     System.out.println(arr[2]);
        // }catch(Exception A){
        //     System.out.println("The error is "+A.getMessage());
        // }

        // int[] nums = {1,2,3};
        // int n = 6;
        // if(nums.length >= 0 && n < nums.length){
        //     System.out.println("The arr is "+nums[n]);
        // }else{
        //     System.out.print("index, "+n+" out for bound length "+nums.length);
        // }

        // linear search
        // int[] nums = {1,24,31,21,88,132,34};
        // int i = 0;
        // int n = 21;
        // while(i < nums.length){
        //     if(nums[i] == n){
        //         System.out.println("The n is found in index no "+i);
        //     }
        //     i++;
        // }

        
    }
}