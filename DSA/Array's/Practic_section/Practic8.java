import java.util.Arrays;

public class Practic8 {
    public static void main(String[] args){
        int nums[] = {0,1,0,3,12,0,4};
        int i = 0;
        int j = nums.length; 
        int k = 0;

        while(i<j){
            if(nums[i] != 0){
                int temp = nums[k];
                nums[k] = nums[i];
                nums[i] = temp;
                k++;
            }
            i++;
        }
        System.out.println(Arrays.toString(nums));
    }
    
}
