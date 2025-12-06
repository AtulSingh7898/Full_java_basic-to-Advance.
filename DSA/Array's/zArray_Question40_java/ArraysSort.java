public class ArraysSort {
//  Check if Array is Sorted
//  Input: [1, 2, 3, 4, 5]
//  Output: true
//  Explanation: The array is sorted in ascending order
    static boolean chackSort(int[] num){
        int i = 0;
        int count = 0;
        int store = 0;
        while(i < num.length){
            if(store < num[i]){
                store = num[i];
                count++;
            }
            i++;
        }
        if(count == num.length){
            return true;
        }
        return false;
    }
    
    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4, 15};
        boolean such = chackSort(nums);
        System.out.println(such);
        int i = 0;
        int j = nums.length;
        int store = 0;
        int count = 0;
        while(i < j){
            if(store < nums[i]){
                store = nums[i];
                count++;
            }
            i++;
        }
        if(count == nums.length){
            System.out.println(true);
        }else System.out.println(false);
    }
}
