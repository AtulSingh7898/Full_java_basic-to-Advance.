
// 27. Find All Triplets in an Array that Sum Up to Zero
//  Input: [1, 0, 1, 2, 1, 4]
//  Output: [[1, 0, 1], [1, 1, 2]]
//  Explanation: The triplets that sum up to zero are [1, 0, 1] and [1, 1, 2]
// package zArray_Question40_java;

public class triplateFind{
    public static void main(String[] args){
        int[] nums = {1,0,1,2,1,4};

        for(int i = 0; i <nums.length; i++){
            for(int j = i+1; j<nums.length; j++){
                if(nums[i] == nums[j]){
                    System.out.println(nums[i]+" "+nums[j-1]+" "+nums[j]);
                }
            }
        }
    }
}