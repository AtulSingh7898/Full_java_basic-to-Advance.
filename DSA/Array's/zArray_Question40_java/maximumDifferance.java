// 37. Find the Maximum DiƯerence Between Two Elements in an
// Array
//  Input: [2, 3, 10, 6, 4, 8, 1]
//  Output: 8
//  Explanation: The maximum diƯerence is 10 2 = 8.

public class maximumDifferance {
    public static void main(String[] args){
        int[] nums = {2, 3, 10, 6, 4, 8, 1};
        int maximum = 0;
        
        for(int i = 0; i < nums.length; i++){
            if(maximum < nums[i]){
                maximum = nums[i];
            }
        }
        int difference = 0;
        int result = 0;
        for(int i = 0; i < nums.length; i++){
            if(maximum==nums[i]){
                break;
            }
            difference = maximum - nums[i];
            if(result < difference){
                result = difference;
            }
        }

        System.out.println(result);
    }
    
}
