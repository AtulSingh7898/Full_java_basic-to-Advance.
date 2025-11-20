// package LeetcodeQuestion;

import java.util.Arrays;

public class Two_Sum{

    static int[] twoSum(int []arr, int target){
        for(int i = 0; i < arr.length; i++){
            for(int j = i+1; j<arr.length; j++){
                if(arr[i]+arr[j] == target){
                    return new int[]{i,j};
                }
            }
        }
        return new int[]{};
    }
    public static void main(String[] args){
        int num[] = {1,2,3,5,9};
        int target = 8;
        int result[] = twoSum(num, target);
        System.out.print(Arrays.toString(result));
    }
}