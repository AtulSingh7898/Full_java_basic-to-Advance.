public class SortIntegerBinary {
    static int[] sortIntgerByBinaryReflaction(int[] nums){

        int arr[] = new int[nums.length];
        for(int i = 0; i <nums.length; i++){
            int temp = nums[i];
            String result = "";
            while(temp != 0){
                int digit = temp%2;
                result = digit+result;
                temp /=2;
            }
            System.out.println(result);
            int temp2 = Integer.parseInt(result);
            int result2 = 0;
            while(temp2 != 0){
                int digit = temp2%10;
                result2 = result2*10+digit;
                temp2 /= 10;
            }
            System.out.println(result2);

            for(int j = 0; j< arr.length; j++){
                // if( < )
            }

        }
        return nums;
    }
    public static void main(String[] args){
        int[] nums = {3,6,5,8};
        // int[] result =  sortIntgerByBinaryReflaction(nums);
        // System.out.println(Arrays.toString(result));

        int i = 0;
        int j = nums.length-1;
        while(i<= j){
            
        }

    }
}
