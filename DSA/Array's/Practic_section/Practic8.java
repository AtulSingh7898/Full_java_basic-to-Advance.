import java.util.Arrays;

public class Practic8 {
    public static int thirdMax(int[] num){
        int i = 0;
        int j  = num.length;
        int first = 0;
        int second = 0;
        int third = 0;

        while(i < j){
            if(num[i] > first){
                third = second;
                second = first;
                first  = num[i];
            }else if(second < num[i] && first > num[i]){
                third = second;
                second = num[i];
            }if(third < num[i] && num[i] < second){
                third = num[i];
            }
            i++;
        }
        return third != Integer.MIN_VALUE ? third : first;
    }

    public static void moveZero(int[] nums){
        int i =0;
        int j = nums.length; 
        int k = 0;
        while(i < j){
            if(nums[i] != 0){
                int temp = nums[k];
                nums[k] = nums[i];
                nums[i] = temp;
                k++;
            }
            i++;
        }
    }

    public static int removeDuplicate(int[] arr){
        int i = 0;
        int j = arr.length;
        int k = 0;
        while(i<j){
            if(arr[i] != arr[k]){
                k++;
                arr[k] = arr[i];
            }
            i++;
        }
        return k;
    }

    public static void removeDuplicate2(int[] arr){
        int i = 0;
        int j = arr.length;
        int k = 0;
        while(i < j){
            if(k < 2 || arr[i] > arr[k-2]){
                arr[k] = arr[i];
                k++;
            }
            i++;
        }
    }
    public static void main(String[] args){

        int nums[] = {1,1,1,2,2,3,3,4,4,4,4,5};
        removeDuplicate2(nums);
        System.out.println(Arrays.toString(nums));
        // //remove duplicate
        // int[] nums = {1,1,2,2,3,4,4,5};
        // int result = removeDuplicate(nums);
        // System.out.println(result);
        // System.out.println(Arrays.toString(nums));

        //Move Zero
        // int nums[] = {0,2,4,0,5,6};
        // moveZero(nums);
        // System.out.println(Arrays.toString(nums));

        // //third maximum
        // int num[]  = {1,2,5,3,43,5,3};
        // int result = thirdMax(num);
        // System.out.println(result);

    }
    
}
