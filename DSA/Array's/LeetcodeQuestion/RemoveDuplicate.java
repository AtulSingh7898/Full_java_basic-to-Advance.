// package LeetcodeQuestion;

public class RemoveDuplicate {
     static int duplcateRemove(int[] nums){
        int i = 0;
        for(int j = 0; j < nums.length; j++){
            if(nums[j] != nums[i]){
                i++;
                nums[i] = nums[j];
            }
        }
        return i+1;
    }
    public static void main(String args[]){
        int[] nums = {0,0,1,1,2,2,3,3,4,4,5,5};
        
        // int result = duplcateRemove(nums);
        // System.out.println(result);

        int j = 0;
        for(int i = 0; i < nums.length; i++){
            if(nums[i] != nums[j]){
                j++;
                nums[j] = nums[i];
            }
        }
        System.out.println(j+1);
    }
    
}
