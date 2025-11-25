// package zArray_Question40_java;

//  Find the Missing Number in an Array
//  Input: [1, 2, 4, 5]
//  Outpu

public class MissingNumber {
    public static void main(String[] args) {
        int[] nums = {1,2,4,5};
        int i = 0;
        int missN = 0;
        int j = 1;
        while(i < nums.length){
            if(nums[i]+1 != nums[j]){
                missN = nums[i]+1;
                
                break;
            }
            j++;
            i++;
        
        }
        System.out.println(missN);
    }
    
}
