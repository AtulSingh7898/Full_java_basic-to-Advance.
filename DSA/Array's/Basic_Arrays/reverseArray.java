public class reverseArray {
    public static void main(String[] args){
        int[] nums = {2,3,6,1,2,8};

        int st = 0;
        int end = nums.length-1;

        while(st <= end){
            int temp = nums[st];
            nums[st] = nums[end];
            nums[end] = temp;
            st++;
            end--;
        }

    }
    
}
