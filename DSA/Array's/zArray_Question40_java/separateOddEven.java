// 32. Separate Even and Odd Numbers in an Array
//  Input: [1, 2, 3, 4, 5]
//  Output: [2, 4, 1, 3, 5]
//  Explanation: Even numbers first followed by odd numbers.

import java.util.Arrays;

public class separateOddEven {

    static int[] evenOdd(int[] nums){
        int i = 0;
        int j = nums.length;
        int k = 0;
        while(i < j){
            if(nums[i]%2 == 0){
                int temp = nums[k];
                nums[k] = nums[i];
                nums[i] = temp;
                k++;
            }
            i++;
        }


        return nums;
    }

    public static void main(String[] main){
        int[] num = {1, 2, 3, 4, 5};
        int[] result = evenOdd(num);
        for(int i : result){
            System.out.print(i+" ");
        }
        System.out.println();
        System.out.println(Arrays.toString(result));

    }
    
}
