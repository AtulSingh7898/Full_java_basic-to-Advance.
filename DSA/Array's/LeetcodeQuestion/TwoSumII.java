import java.util.Arrays;

public class TwoSumII{
    public static  int[] twoSum(int[] nums, int target) {
        int i = 0;
        int j = nums.length-1;
        
        while(i<j){
            if(nums[i]+nums[j] == target){
                return new int[]{i,j};
            }if(nums[i]+nums[j] > target){
                j--;
            }else{
                i++;
            }
        }
        return new int[]{-1,-1};

    }

    public static void main(String[] args) {
        int[] arr = {1,2,4,6,12,65};
        int target = 67;
        int[] result = twoSum(arr, target);
        System.out.println(Arrays.toString(result));
    }
}