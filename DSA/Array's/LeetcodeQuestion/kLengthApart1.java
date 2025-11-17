package LeetcodeQuestion;

public class kLengthApart1 {
    public static boolean kLengthApart(int[] nums, int k) {
        int i = 0;
        int j = nums.length-1;
        int distence = 0;
        int temp = 0;
        while(i <= j){
            if(nums[i] != 1){
                distence++;
            }else if(nums[i] == 1){
                temp = distence;
                distence = 0;
                if(temp < k && i != 0){
                    return false;
                }else{
                    temp = distence;
                }

            }
            i++;

        }
        if(k-1 == temp){
            return false;
        }
        if( temp == k && temp < k){
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        int[] arr = {1,0,0,0};
        int k = 2;
        boolean result = kLengthApart(arr,k);
        System.out.println(result);
    }
    
}
