

public class twoSums{
    public int[] twoSum(int[] nums, int target) {
        
        int sum = 0;
        int i = 0;
        int j = nums.length-1;
        while(i<=j){
            sum = nums[i]+nums[j];
            if(target==sum){
                return new int[]{i,j};
            }else if(target<nums[j]){
                j--;
            }else
            i++;
        }
        return new int[]{-1,-1};
        
    }
    public static void main(String[] args){
        int[] nums = {-1,-2,-3,-4,-5};
    }
}