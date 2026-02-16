import java.util.Arrays;

// tim Short 

public class BubbleS{
    public static void bubbleShort(int[] nums){
        boolean swaped = true;
        int count  = 0;
        for(int i = 0; i < nums.length-1; i++){
            swaped = false;
            for(int j = 0; j < nums.length-1; j++){
                if(nums[j]>nums[j+1]){
                    int temp = nums[j+1];
                    nums[j+1] = nums[j];
                    nums[j] = temp;
                    count++;
                    swaped = true;
                }
            }
            if(!swaped){
                break;
            }
        }
       
        System.out.println(count);
        System.out.println(Arrays.toString(nums));
    }
    public static void main(String[] args) {
        int nums[] = {1,3,4,5,6,4,2,8,5};
        bubbleShort(nums);
    }
}