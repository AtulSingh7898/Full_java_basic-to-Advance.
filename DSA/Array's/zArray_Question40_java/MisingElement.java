
// 30. Find the Missing Elements in an Array
//  Input: [1, 3, 5, 7]
//  Output: [2, 4, 6]
//  Explanation: The missing elements are 2, 4, 6.

public class MisingElement {
    public static void main(String[] args){
        int[] nums = {1, 3, 5, 7};
        for(int i = 0; i < nums.length-1; i++){
            if (nums[i] != nums[i]+1) {
                System.out.println(nums[i]+1);
            }
        }
    }
    
}
