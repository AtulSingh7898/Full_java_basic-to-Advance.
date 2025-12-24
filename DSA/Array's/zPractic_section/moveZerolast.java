import java.util.Arrays;

public class moveZerolast {
    static void moveZero(int[] nums){
        int i = 0;
        int k = 0;
        while(i < nums.length){
            if(nums[i] != 0){
                int temp = nums[k];
                nums[k] = nums[i];
                nums[i] = temp;
                k++;
            }
            i++;
        }
        
    }
    public static void main(String[] args){
        int[] nums = {0,1,3,0,12,32,0};
        moveZero(nums);
        System.out.println(Arrays.toString(nums));
    
    }
    
}