// 33. Find the Kth Largest Element in an Array
//  Input: ([3, 2, 1, 5, 6, 4], 2)
//  Output: 5
//  Explanation: The 2nd largest element is 5.

public class KthLargest {

    static int klargestElement(int[] nums, int k){
        int first = 0;
        int second = 0;
        int i = 0;
        int j = nums.length;
        while(i < j){
            if(first < nums[i]){
                second = first;
                first = nums[i];
            }
            i++;
        }


        return second;
    }

    public static void main(String[] args){
        int[] nums = {3,2,1,5,6,4};
        int k = 2;
        int result = klargestElement(nums, k);
        System.out.println(result);
    }
    
}
