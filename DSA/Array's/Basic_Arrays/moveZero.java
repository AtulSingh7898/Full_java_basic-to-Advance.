import java.util.Arrays;

public class moveZero {
    static void moveElement(int[] nums){
        int st = 0;
        int k = 0;
        int end = nums.length-1;

        while(st<= end){
            if(nums[st] != 0){
                int temp = nums[st];
                nums[st] = nums[k];
                nums[k] = temp;
                k++;
            }
            st++;
        }
    }
    // when order is not change so that is why is start with initial pointer not start with start and end. 
    public static void main(String[] args){
        int[] nums = {0,1,0,2,0,13,14};
        moveElement(nums);
        System.out.println(Arrays.toString(nums));
    }
    
}
