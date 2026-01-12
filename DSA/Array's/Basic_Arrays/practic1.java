import java.util.Arrays;

public class practic1 {
    public static void main(String[] main){
        int[] nums = {10,20,30,40,50,60};
        int insertIndex = 2;
        int insertValue = 100;

        for(int i = nums.length-1; i > insertIndex; i--){
            nums[i] = nums[i-1];
        }
        // System.out.println(Arrays.toString(nums));
        nums[insertIndex] = insertValue;

        System.out.println(Arrays.toString(nums));
    }
    
}
